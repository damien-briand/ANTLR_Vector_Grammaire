package utils;
import org.antlr.v4.runtime.*;
import java.util.Collections;
import java.util.List;

public class MySyntaxeErrorListener extends BaseErrorListener {
    private int line;
    private int column;
    private ParserRuleContext ctx;
    private String message;
    private String varName;

    public MySyntaxeErrorListener(ParserRuleContext ctx, String varName) {
        this.ctx = ctx;
        this.varName = varName;

        setLine(this.ctx);
        setColumn(this.ctx);
        this.line = getLine();
        this.column = getColumn();
    }

    public int getLine() {
        return line;
    }

    public void setLine(ParserRuleContext ctx) {
        this.line = ctx.getStart().getLine();
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(ParserRuleContext ctx) {
        this.column = ctx.getStart().getCharPositionInLine() + 1;
    }

    public ParserRuleContext getCtx() {
        return ctx;
    }

    public void setCtx(ParserRuleContext ctx) {
        this.ctx = ctx;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getVarName() {
        return varName;
    }

    public void setVarName(String varName) {
        this.varName = varName;
    }

    public String getErrorDeclaration() {
        return "Error : Variable " + varName + " is not declared." + " (line " + line + ", column " + column + ")";
    }

    public String getErrorAlreadyDecl(){
        return "Error Variable " + varName + " is already declared." + " (line " + line + ", column " + column + ")";
    }

    public String getErrorTypeMismatch(String type) {
        return "Type mismatch: Variable " + varName + " is not of type " + type + "." + " (line " + line + ", column " + column + ")";
    }
}
