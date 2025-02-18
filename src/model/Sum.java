package model;

import evaluationWithVisitor.StackBasedOperationsVisitor;

public class Sum extends SimpleOp {
    public Sum() {
        super();
    }

    @Override
    public String toString() {
        return "sum " + this.getData().toString();
    }

    @Override
    public void accept(StackBasedOperationsVisitor<?> visitor) {
        visitor.visit(this);
    }
}
