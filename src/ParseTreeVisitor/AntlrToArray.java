package ParseTreeVisitor;

import antlr.ArrayOperationsBaseVisitor;
import antlr.ArrayOperationsParser;

import java.util.ArrayList;

public class AntlrToArray extends ArrayOperationsBaseVisitor<ArrayList<Integer>> {
    @Override
    public ArrayList<Integer> visitArray(ArrayOperationsParser.ArrayContext ctx) {
        ArrayList<Integer> theArray = new ArrayList<>();
        for (int i = 1; i < ctx.getChildCount(); i=i+2) {
            theArray.add(Integer.parseInt(ctx.getChild(i).getText()));
        }
        return theArray;
    }
}
