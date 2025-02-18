package ParseTreeVisitor;

import antlr.stackbasedoperationsBaseVisitor;
import antlr.stackbasedoperationsParser;

import java.util.ArrayList;

public class AntlrToArray extends stackbasedoperationsBaseVisitor<ArrayList<Integer>> {
    @Override
    public ArrayList<Integer> visitArray(stackbasedoperationsParser.ArrayContext ctx) {
        ArrayList<Integer> theArray = new ArrayList<>();
        for (int i = 1; i < ctx.getChildCount(); i=i+2) {
            theArray.add(Integer.parseInt(ctx.getChild(i).getText()));
        }
        return theArray;
    }
}
