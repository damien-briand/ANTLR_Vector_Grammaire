package ParseTreeVisitor;

import antlr.stackbasedoperationsBaseVisitor;
import antlr.stackbasedoperationsParser;
import evaluationWithVisitor.Variable;
import model.Affectation;
import model.SimpleOp;

import java.util.HashMap;
import java.util.List;

public class AntlrToAffectation extends stackbasedoperationsBaseVisitor<Affectation<?>> {
    // List of semantic errors
    private List<String> semanticErrors;

    // The symbol table stores all the variables declared in the program so far
    private HashMap<String, Variable> symbolTable;

    public AntlrToAffectation(List<String> semanticErrors, HashMap<String, Variable> symbolTable) {
        this.semanticErrors = semanticErrors;
        this.symbolTable = symbolTable;
    }

    @Override
    public Affectation<?> visitAffectsimpleop(stackbasedoperationsParser.AffectsimpleopContext ctx) {
        String varName = ctx.ID().getText();
        if (!symbolTable.containsKey(varName)) {
            semanticErrors.add("Variable " + varName + " is not declared.");
            return null;
        }
        AntlrToSimpleOp simpleOpVisitor = new AntlrToSimpleOp();
        SimpleOp simpleOp = simpleOpVisitor.visit(ctx.simpleop());
        Variable var = symbolTable.get(varName);
        if (!var.getType().equals("simpleop")) {
            semanticErrors.add("Type mismatch: Variable " + varName + " is not of type simpleop.");
            return null;
        }
        return new Affectation<>(varName, simpleOp);
    }

    @Override
    public Affectation<?> visitAffectarray(stackbasedoperationsParser.AffectarrayContext ctx) {
        String varName = ctx.ID().getText();
        if (!symbolTable.containsKey(varName)) {
            semanticErrors.add("Variable " + varName + " is not declared.");
            return null;
        }
        AntlrToArray arrayVisitor = new AntlrToArray();
        List<Integer> arrayValues = arrayVisitor.visit(ctx.array());
        Variable var = symbolTable.get(varName);
        if (!var.getType().equals("array")) {
            semanticErrors.add("Type mismatch: Variable " + varName + " is not of type array.");
            return null;
        }
        return new Affectation<>(varName, arrayValues);
    }

    @Override
    public Affectation<?> visitAffectint(stackbasedoperationsParser.AffectintContext ctx) {
        String varName = ctx.ID().getText();
        if (!symbolTable.containsKey(varName)) {
            semanticErrors.add("Variable " + varName + " is not declared.");
            return null;
        }
        int value = Integer.parseInt(ctx.INT().getText());
        Variable var = symbolTable.get(varName);
        if (!var.getType().equals("int")) {
            semanticErrors.add("Type mismatch: Variable " + varName + " is not of type int.");
            return null;
        }
        return new Affectation<>(varName, value);
    }
}