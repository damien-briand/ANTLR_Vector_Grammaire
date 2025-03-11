package ParseTreeVisitor;

import antlr.stackbasedoperationsBaseVisitor;
import antlr.stackbasedoperationsParser;
import evaluationWithVisitor.Variable;
import model.Affectation;
import model.SimpleOp;
import utils.MySyntaxeErrorListener;

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
            MySyntaxeErrorListener syntaxError = new MySyntaxeErrorListener(ctx, varName);
            semanticErrors.add(syntaxError.getErrorDeclaration());
        }
        AntlrToSimpleOp simpleOpVisitor = new AntlrToSimpleOp(semanticErrors, symbolTable);
        SimpleOp simpleOp = simpleOpVisitor.visit(ctx.simpleop());
        Variable var = symbolTable.get(varName);
        if (!var.getType().equals("simpleop")) {
            MySyntaxeErrorListener syntaxError = new MySyntaxeErrorListener(ctx, varName);
            semanticErrors.add(syntaxError.getErrorTypeMismatch("simpleop"));
        }
        return new Affectation<>(varName, simpleOp);
    }

    @Override
    public Affectation<?> visitAffectarray(stackbasedoperationsParser.AffectarrayContext ctx) {
        String varName = ctx.ID().getText();
        if (!symbolTable.containsKey(varName)) {
            MySyntaxeErrorListener syntaxError = new MySyntaxeErrorListener(ctx, varName);
            semanticErrors.add(syntaxError.getErrorDeclaration());
        }
        AntlrToArray arrayVisitor = new AntlrToArray();
        List<Integer> arrayValues = arrayVisitor.visit(ctx.array());
        Variable var = symbolTable.get(varName);
        if (!var.getType().equals("array")) {
            MySyntaxeErrorListener syntaxError = new MySyntaxeErrorListener(ctx, varName);
            semanticErrors.add(syntaxError.getErrorTypeMismatch("array"));
        }
        return new Affectation<>(varName, arrayValues);
    }

    @Override
    public Affectation<?> visitAffectint(stackbasedoperationsParser.AffectintContext ctx) {
        String varName = ctx.ID().getText();
        if (!symbolTable.containsKey(varName)) {
            MySyntaxeErrorListener syntaxError = new MySyntaxeErrorListener(ctx, varName);
            semanticErrors.add(syntaxError.getErrorDeclaration());
        }
        int value = Integer.parseInt(ctx.INT().getText());
        Variable var = symbolTable.get(varName);
        if (!var.getType().equals("int")) {
            MySyntaxeErrorListener syntaxError = new MySyntaxeErrorListener(ctx, varName);
            semanticErrors.add(syntaxError.getErrorTypeMismatch("int"));
        }
        return new Affectation<>(varName, value);
    }
}