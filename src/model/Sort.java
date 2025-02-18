package model;

import evaluationWithVisitor.StackBasedOperationsVisitor;

public class Sort extends SimpleOp {

    public Sort() {
        super();
    }

    @Override
    public String toString() {
        return "sort " + this.getData().toString();
    }

    @Override
    public void accept(StackBasedOperationsVisitor<?> visitor) {
        visitor.visit(this);
    }
}
