package ParseTreeVisitor;

import antlr.ArrayOperationsBaseVisitor;
import antlr.ArrayOperationsParser;
import evaluationWithVisitor.Variable;
import model.varOut;
import utils.MySyntaxeErrorListener;

import java.util.HashMap;
import java.util.List;

public class AntlrToVarOut extends ArrayOperationsBaseVisitor<varOut> {
    // List of semantic errors
    private List<String> semanticErrors;

    // The symbol table stores all the variables declared in the program so far
    private HashMap<String, Variable> symbolTable;

    public AntlrToVarOut(List<String> semanticErrors, HashMap<String, Variable> symbolTable) {
        this.semanticErrors = semanticErrors;
        this.symbolTable = symbolTable;
    }

    @Override
    public varOut visitVarout(ArrayOperationsParser.VaroutContext ctx) {
        String varName = ctx.ID().getText();
        if (!symbolTable.containsKey(varName)) {
            MySyntaxeErrorListener syntaxError = new MySyntaxeErrorListener(ctx, varName);
            semanticErrors.add(syntaxError.getErrorDeclaration());
            return null;
        }
        return new varOut(varName);
    }
}