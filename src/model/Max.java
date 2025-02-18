package model;

import evaluationWithVisitor.StackBasedOperationsVisitor;

public class Max extends SimpleOp {

    public Max() {
        super();
    }

    @Override
    public String toString() {
        return "max " + this.getData().toString();
    }

    @Override
    public void accept(StackBasedOperationsVisitor<?> visitor) {
        visitor.visit(this);
    }
}
