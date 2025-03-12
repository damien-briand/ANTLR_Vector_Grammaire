package ParseTreeVisitor;

import antlr.ArrayOperationsBaseVisitor;
import antlr.ArrayOperationsParser;
import evaluationWithVisitor.Variable;
import model.VariableDeclaration;
import org.antlr.v4.runtime.Token;
import utils.MySyntaxeErrorListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AntlrToVarDecl extends ArrayOperationsBaseVisitor<VariableDeclaration<?>> {
    // List of semantic errors
    private List<String> semanticErrors;

    // The symbol table stores all the variables declared in the program so far
    private HashMap<String, Variable> symbolTable;

    public AntlrToVarDecl(List<String> semanticErrors, HashMap<String, Variable> symbolTable) {
        this.semanticErrors = semanticErrors;
        this.symbolTable = symbolTable;
    }

    @Override
    public VariableDeclaration<?> visitVararray(ArrayOperationsParser.VararrayContext ctx) {
        // ARRAY_TYPE ID ';' #vararray
        Token idToken = ctx.ID().getSymbol();
        int line = idToken.getLine();
        int column = idToken.getCharPositionInLine() + 1;

        String type = ctx.getChild(0).getText();
        String id = ctx.getChild(1).getText();

        if (symbolTable.containsKey(id)) {
            MySyntaxeErrorListener syntaxError = new MySyntaxeErrorListener(ctx, id);
            semanticErrors.add(syntaxError.getErrorAlreadyDecl());
        } else {

            symbolTable.put(id, new Variable(id, type));
        }

        return new VariableDeclaration(id, type);
    }

    @Override
    public VariableDeclaration<?> visitInitvararray(ArrayOperationsParser.InitvararrayContext ctx) {
        // ARRAY_TYPE ID '=' array ';'   #initvararray
        Token idToken = ctx.ID().getSymbol();
        int line = idToken.getLine();
        int column = idToken.getCharPositionInLine() + 1;

        String type = ctx.getChild(0).getText();
        String id = ctx.getChild(1).getText();
        ArrayList<Integer> array = new AntlrToArray().visit(ctx.array());

        if (symbolTable.containsKey(id)) {
            MySyntaxeErrorListener syntaxError = new MySyntaxeErrorListener(ctx, id);
            semanticErrors.add(syntaxError.getErrorAlreadyDecl());
        } else {
            symbolTable.put(id, new Variable(id, type, array));
        }

        return new VariableDeclaration(id, type, array);
    }


    @Override
    public VariableDeclaration<?> visitVarint(ArrayOperationsParser.VarintContext ctx) {
        // INT_TYPE ID ';' #varint
        Token idToken = ctx.ID().getSymbol();
        int line = idToken.getLine();
        int column = idToken.getCharPositionInLine() + 1;

        String type = ctx.getChild(0).getText();
        String id = ctx.getChild(1).getText();

        if (symbolTable.containsKey(id)) {
            MySyntaxeErrorListener syntaxError = new MySyntaxeErrorListener(ctx, id);
            semanticErrors.add(syntaxError.getErrorAlreadyDecl());
        } else {

            symbolTable.put(id, new Variable(id, type));
        }

        return new VariableDeclaration(id, type);
    }

    @Override
    public VariableDeclaration visitInitvarint(ArrayOperationsParser.InitvarintContext ctx) {
        // INT_TYPE ID '=' INT ';'       #initvarint
        Token idToken = ctx.ID().getSymbol();
        int line = idToken.getLine();
        int column = idToken.getCharPositionInLine() + 1;

        String type = ctx.getChild(0).getText();
        String id = ctx.getChild(1).getText();
        Integer value = Integer.parseInt(ctx.INT().getText());

        if (symbolTable.containsKey(id)) {
            MySyntaxeErrorListener syntaxError = new MySyntaxeErrorListener(ctx, id);
            semanticErrors.add(syntaxError.getErrorAlreadyDecl());
        } else {
            symbolTable.put(id, new Variable(id, type, value));
        }

        return new VariableDeclaration(id, type, value);
    }
}