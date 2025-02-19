package ParseTreeVisitor;

import antlr.stackbasedoperationsBaseVisitor;
import antlr.stackbasedoperationsParser;
import evaluationWithVisitor.Variable;
import model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AntlrToSimpleOp extends stackbasedoperationsBaseVisitor<SimpleOp> {
    final AntlrToArray arrayVisitor = new AntlrToArray();
    // List of semantic errors
    private List<String> semanticErrors;
    // the symboles table stores all the variables declared in the program so far,
    private HashMap<String, Variable> symbolTable;

    public AntlrToSimpleOp(List<String> semanticErrors, HashMap<String, Variable> symbolTable) {
        this.semanticErrors = semanticErrors;
        this.symbolTable = symbolTable;
    }

    @Override
    public Max visitMax(stackbasedoperationsParser.MaxContext ctx) {
        ArrayList<Integer> arrayVisit = arrayVisitor.visit(ctx.array());
        Max max = new Max();
        max.setData(arrayVisit);
        return max;
    }

    @Override
    public Min visitMin(stackbasedoperationsParser.MinContext ctx) {
        ArrayList<Integer> arrayVisit = arrayVisitor.visit(ctx.array());
        Min min = new Min();
        min.setData(arrayVisit);
        return min;
    }

    @Override
    public Prod visitProd(stackbasedoperationsParser.ProdContext ctx) {
        ArrayList<Integer> arrayVisit = arrayVisitor.visit(ctx.array());
        Prod prod = new Prod();
        prod.setData(arrayVisit);
        return prod;
    }

    @Override
    public Sort visitSort(stackbasedoperationsParser.SortContext ctx) {
        ArrayList<Integer> arrayVisit = arrayVisitor.visit(ctx.array());
        Sort sort = new Sort();
        sort.setData(arrayVisit);
        return sort;
    }

    @Override
    public Sum visitSum(stackbasedoperationsParser.SumContext ctx) {
        ArrayList<Integer> arrayVisit = arrayVisitor.visit(ctx.array());
        Sum sum = new Sum();
        sum.setData(arrayVisit);
        return sum;
    }
}
