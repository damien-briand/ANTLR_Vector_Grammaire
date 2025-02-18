package ParseTreeVisitor;

import antlr.stackbasedoperationsBaseVisitor;
import antlr.stackbasedoperationsParser;
import model.*;

import java.util.ArrayList;

public class AntlrToSimpleOp extends stackbasedoperationsBaseVisitor<SimpleOp> {
    final AntlrToArray arrayVisitor = new AntlrToArray();

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
