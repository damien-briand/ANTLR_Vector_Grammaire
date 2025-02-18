package ParseTreeVisitor;

import antlr.stackbasedoperationsBaseVisitor;
import antlr.stackbasedoperationsParser;
import evaluationWithVisitor.Variable;
import model.varOut;

import java.util.HashMap;
import java.util.List;

public class AntlrToVarOut extends stackbasedoperationsBaseVisitor<varOut> {
    // List of semantic errors
    private List<String> semanticErrors;

    // The symbol table stores all the variables declared in the program so far
    private HashMap<String, Variable> symbolTable;

    public AntlrToVarOut(List<String> semanticErrors, HashMap<String, Variable> symbolTable) {
        this.semanticErrors = semanticErrors;
        this.symbolTable = symbolTable;
    }

    @Override
    public varOut visitVarout(stackbasedoperationsParser.VaroutContext ctx) {
        String varName = ctx.ID().getText();
        if (!symbolTable.containsKey(varName)) {
            semanticErrors.add("Variable " + varName + " is not declared.");
            return null;
        }
        return new varOut(varName);
    }
}