package ParseTreeVisitor;

import antlr.stackbasedoperationsBaseVisitor;
import antlr.stackbasedoperationsParser;
import evaluationWithVisitor.Variable;
import model.*;

import java.util.HashMap;
import java.util.List;

public class AntlrToInstruction extends stackbasedoperationsBaseVisitor<Instruction> {
    // List of semantic errors
    private List<String> semanticErrors;
    // the symboles table stores all the variables declared in the program so far,
    private HashMap<String, Variable> symbolTable;

    public AntlrToInstruction(List<String> semanticErrors, HashMap<String, Variable> symbolTable) {
        this.semanticErrors = semanticErrors;
        this.symbolTable = symbolTable;
    }

    @Override
    public Instruction visitSimpleopinstruction(stackbasedoperationsParser.SimpleopinstructionContext ctx) {
        return new AntlrToSimpleOp(semanticErrors, symbolTable).visit(ctx.simpleop());
    }

    @Override
    public Instruction visitVardeclinstruction(stackbasedoperationsParser.VardeclinstructionContext ctx) {
        return new AntlrToVarDecl(semanticErrors, symbolTable).visit(ctx.vardecl());
    }

    @Override
    public Instruction visitAffectationinstruction(stackbasedoperationsParser.AffectationinstructionContext ctx) {
        return new AntlrToAffectation(semanticErrors, symbolTable).visit(ctx.affectation());
    }

    @Override
    public Instruction visitVaroutinstruction(stackbasedoperationsParser.VaroutinstructionContext ctx) {
        return new AntlrToVarOut(semanticErrors, symbolTable).visit(ctx.varout());
    }
}
