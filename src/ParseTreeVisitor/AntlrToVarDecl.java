package ParseTreeVisitor;

import antlr.stackbasedoperationsBaseVisitor;
import antlr.stackbasedoperationsParser;
import evaluationWithVisitor.Variable;
import model.VariableDeclaration;

import java.util.HashMap;
import java.util.List;

public class AntlrToVarDecl extends stackbasedoperationsBaseVisitor<VariableDeclaration<?>> {
    // List of semantic errors
    private List<String> semanticErrors;

    // The symbol table stores all the variables declared in the program so far
    private HashMap<String, Variable<?>> symbolTable;

    public AntlrToVarDecl(List<String> semanticErrors, HashMap<String, Variable<?>> symbolTable) {
        this.semanticErrors = semanticErrors;
        this.symbolTable = symbolTable;
    }

    @Override
    public VariableDeclaration<?> visitVararray(stackbasedoperationsParser.VararrayContext ctx) {
        String varName = ctx.ID().getText();
        if (symbolTable.containsKey(varName)) {
            semanticErrors.add("Variable " + varName + " is already declared.");
            return null;
        }
        VariableDeclaration<?> varDecl = new VariableDeclaration<>(varName, "array");
        symbolTable.put(varName, new Variable(varName, "array"));
        return varDecl;
    }

    @Override
    public VariableDeclaration<?> visitInitvararray(stackbasedoperationsParser.InitvararrayContext ctx) {
        String varName = ctx.ID().getText();
        if (symbolTable.containsKey(varName)) {
            semanticErrors.add("Variable " + varName + " is already declared.");
            return null;
        }
        List<Integer> arrayValues = new AntlrToArray().visit(ctx.array());
        VariableDeclaration<?> varDecl = new VariableDeclaration<>(varName, "array", arrayValues);
        symbolTable.put(varName, new Variable(varName, "array", arrayValues));
        return varDecl;
    }

    @Override
    public VariableDeclaration<?> visitVarint(stackbasedoperationsParser.VarintContext ctx) {
        String varName = ctx.ID().getText();
        if (symbolTable.containsKey(varName)) {
            semanticErrors.add("Variable " + varName + " is already declared.");
            return null;
        }
        VariableDeclaration<?> varDecl = new VariableDeclaration<>(varName, "int");
        symbolTable.put(varName, new Variable(varName, "int"));
        return varDecl;
    }

    @Override
    public VariableDeclaration<?> visitInitvarint(stackbasedoperationsParser.InitvarintContext ctx) {
        String varName = ctx.ID().getText();
        if (symbolTable.containsKey(varName)) {
            semanticErrors.add("Variable " + varName + " is already declared.");
            return null;
        }
        int value = Integer.parseInt(ctx.INT().getText());
        VariableDeclaration<?> varDecl = new VariableDeclaration<>(varName, "int", value);
        symbolTable.put(varName, new Variable(varName, "int", value));
        return varDecl;
    }
}