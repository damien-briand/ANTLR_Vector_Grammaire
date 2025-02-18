package ParseTreeVisitor;

import antlr.stackbasedoperationsBaseVisitor;
import antlr.stackbasedoperationsParser;
import evaluationWithVisitor.Variable;
import model.Instruction;
import model.Program;

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
}
