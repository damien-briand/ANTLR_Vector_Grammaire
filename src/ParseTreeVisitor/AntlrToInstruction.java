package ParseTreeVisitor;

import antlr.ArrayOperationsBaseVisitor;
import antlr.ArrayOperationsParser;
import evaluationWithVisitor.Variable;
import model.*;

import java.util.HashMap;
import java.util.List;

public class AntlrToInstruction extends ArrayOperationsBaseVisitor<Instruction> {
    // List of semantic errors
    private List<String> semanticErrors;
    // the symboles table stores all the variables declared in the program so far,
    private HashMap<String, Variable> symbolTable;

    public AntlrToInstruction(List<String> semanticErrors, HashMap<String, Variable> symbolTable) {
        this.semanticErrors = semanticErrors;
        this.symbolTable = symbolTable;
    }

    @Override
    public Instruction visitSimpleopinstruction(ArrayOperationsParser.SimpleopinstructionContext ctx) {
        return new AntlrToSimpleOp(semanticErrors, symbolTable).visit(ctx.simpleop());
    }

    @Override
    public Instruction visitVardeclinstruction(ArrayOperationsParser.VardeclinstructionContext ctx) {
        return new AntlrToVarDecl(semanticErrors, symbolTable).visit(ctx.vardecl());
    }

    @Override
    public Instruction visitAffectationinstruction(ArrayOperationsParser.AffectationinstructionContext ctx) {
        return new AntlrToAffectation(semanticErrors, symbolTable).visit(ctx.affectation());
    }

    @Override
    public Instruction visitVaroutinstruction(ArrayOperationsParser.VaroutinstructionContext ctx) {
        return new AntlrToVarOut(semanticErrors, symbolTable).visit(ctx.varout());
    }

    @Override
    public Instruction visitVarininstruction(ArrayOperationsParser.VarininstructionContext ctx) {
        return new AntlrToVarIn(semanticErrors, symbolTable).visit(ctx.varin());
    }
}
