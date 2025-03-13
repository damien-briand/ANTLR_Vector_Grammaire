package apps;

import ParseTreeVisitor.AntlrToProgram;
import antlr.ArrayOperationsLexer;
import antlr.ArrayOperationsParser;
import evaluationWithVisitor.ArrayOperationDoInterpretVisitor;
import model.Program;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

public class ComputeApp_EvalVisitor {

    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.err.println("Usage: file name\n");
        } else {
            String fileName = args[0];
            // get the parser with the helper method
            ArrayOperationsParser parser = getParser(fileName);

            // build the parse tree (begin parsing at input rule 'mm')
            ParseTree tree = parser.program();
            // print LISP-style tree
            System.out.print("Tree in LISP format\n-->");
            System.out.println(tree.toStringTree(parser));

            // build the visitor for the first named rule
            AntlrToProgram inputVisitor = new AntlrToProgram();
            // use this visitor to visit the parse tree
            // this visitor produce a Model object
            Program commandLineModel = inputVisitor.visit(tree);
            //Print the model
            System.out.println("The model printed using toString of the Model classes:");
            System.out.println(commandLineModel.instructions);

            // Affiche les variables
            System.out.println("\nThe symbol table:");
            inputVisitor.symbolTable.forEach((k, v) -> {
                System.out.println(v.getType() + " " + k + " = " + v.getValue());
            });
            System.out.println("\n");

            // print the semantic errors
            if (inputVisitor.semanticErrors.size() > 0){
                System.err.println("** Semantic errors **");
                for (String error : inputVisitor.semanticErrors) {
                    System.err.println(error);
                }
            }
            // build the visitor for the first named rule
            ArrayOperationDoInterpretVisitor doInterpretVisitor = new ArrayOperationDoInterpretVisitor();
            // use this visitor to visit the parse tree
            // this visitor produce a Model object
            Object result = doInterpretVisitor.visit(commandLineModel);
        }
    }

    // helper method, the same for every grammar
    /*
     * Here the type of parser and lexer are specific to the
     * grammar name expressionprefixe.g4
     */
    private static ArrayOperationsParser getParser(String fileName) {
        ArrayOperationsParser parser = null;

        try {
            CharStream input = CharStreams.fromFileName(fileName);
            // build the lexer (tokenizer)
            ArrayOperationsLexer lexer = new ArrayOperationsLexer(input);
            // produce the list of tokens
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            // initialize parser on the tokens
            parser = new ArrayOperationsParser(tokens);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return parser;
    }

}
