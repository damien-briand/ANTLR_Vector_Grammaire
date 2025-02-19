package ParseTreeVisitor;

import antlr.stackbasedoperationsBaseVisitor;
import antlr.stackbasedoperationsParser;
import evaluationWithVisitor.Variable;
import model.Program;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AntlrToProgram extends stackbasedoperationsBaseVisitor<Program>{

    // List of semantic errors
    // – variable re-declaration
    // – variable not declared
    // – affectation to a none conformant type
    // public to be accessed by the main application program
    public List<String> semanticErrors;

    // the symboles table stores all the variables declared in the program (name, type and value)
    // public to be accesed by the main application program
    public HashMap<String, Variable> symbolTable;

    @Override
    public Program visitProgram(stackbasedoperationsParser.ProgramContext ctx) {
        // program : (instruction)+ EOF;
        Program theProgram = new Program();
        symbolTable = new HashMap<>();
        semanticErrors = new ArrayList<>();
        AntlrToInstruction theSimpleOp = new AntlrToInstruction(semanticErrors, symbolTable);

        for (int i = 0; i < ctx.getChildCount()-1; i++) {
            theProgram.addInstruction(theSimpleOp.visit(ctx.getChild(i)));
        }
        return theProgram;
    }
}
