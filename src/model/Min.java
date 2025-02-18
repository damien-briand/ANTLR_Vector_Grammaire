package model;

import evaluationWithVisitor.StackBasedOperationsVisitor;

public class Min extends SimpleOp {

    public Min() {
        super();
    }

    @Override
    public String toString() {
        return "min " + this.getData().toString();
    }

    @Override
    public void accept(StackBasedOperationsVisitor<?> visitor) {
        visitor.visit(this);
    }
}
