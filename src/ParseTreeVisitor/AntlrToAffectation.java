package ParseTreeVisitor;

import antlr.ArrayOperationsBaseVisitor;
import antlr.ArrayOperationsParser;
import evaluationWithVisitor.Variable;
import model.Affectation;
import model.SimpleOp;
import utils.MySyntaxeErrorListener;

import java.util.HashMap;
import java.util.List;

public class AntlrToAffectation extends ArrayOperationsBaseVisitor<Affectation<?>> {
    // List of semantic errors
    private List<String> semanticErrors;

    // The symbol table stores all the variables declared in the program so far
    private HashMap<String, Variable> symbolTable;

    public AntlrToAffectation(List<String> semanticErrors, HashMap<String, Variable> symbolTable) {
        this.semanticErrors = semanticErrors;
        this.symbolTable = symbolTable;
    }

    /**
     * Visits an Affectsimpleop node and creates an Affectation object for a simple operation.
     * It checks if the variable is declared and if the type matches "simpleop".
     * If the variable is not declared or the type does not match, it adds a semantic error.
     *
     * @param ctx the Affectsimpleop context to visit
     * @return an Affectation object representing the simple operation
     */
    @Override
    public Affectation<?> visitAffectsimpleop(ArrayOperationsParser.AffectsimpleopContext ctx) {
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

    /**
     * Visits an Affectarray node and creates an Affectation object for an array.
     * It checks if the variable is declared and if the type matches "array".
     * If the variable is not declared or the type does not match, it adds a semantic error.
     *
     * @param ctx the Affectarray context to visit
     * @return an Affectation object representing the array
     */
    @Override
    public Affectation<?> visitAffectarray(ArrayOperationsParser.AffectarrayContext ctx) {
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

    /**
     * Visits an Affectint node and creates an Affectation object for an integer value.
     * It checks if the variable is declared and if the type matches "int".
     * If the variable is not declared or the type does not match, it adds a semantic error.
     *
     * @param ctx the Affectint context to visit
     * @return an Affectation object representing the integer value
     */
    @Override
    public Affectation<?> visitAffectint(ArrayOperationsParser.AffectintContext ctx) {
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

    @Override
    public Affectation<?> visitAffectvar(ArrayOperationsParser.AffectvarContext ctx) {
        String varName1 = ctx.getChild(0).getText();
        String varName2 = ctx.getChild(2).getText();
        if (!symbolTable.containsKey(varName1)) {
            MySyntaxeErrorListener syntaxError = new MySyntaxeErrorListener(ctx, varName1);
            semanticErrors.add(syntaxError.getErrorDeclaration());
        }
        if (!symbolTable.containsKey(varName2)) {
            MySyntaxeErrorListener syntaxError = new MySyntaxeErrorListener(ctx, varName2);
            semanticErrors.add(syntaxError.getErrorDeclaration());
        }
        Variable var1 = symbolTable.get(varName1);
        Variable var2 = symbolTable.get(varName2);
        if (!var1.getType().equals(var2.getType())) {
            MySyntaxeErrorListener syntaxError = new MySyntaxeErrorListener(ctx, varName1);
            semanticErrors.add(syntaxError.getErrorTypeMismatch(var2.getType()));
        }
        return new Affectation<>(varName1, varName2);
    }
}