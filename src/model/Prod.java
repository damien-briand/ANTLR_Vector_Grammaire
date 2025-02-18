package model;

import evaluationWithVisitor.StackBasedOperationsVisitor;

public class Prod extends SimpleOp {

    public Prod() {
        super();
    }

    @Override
    public String toString() {
        return "prod " + this.getData().toString();
    }

    @Override
    public void accept(StackBasedOperationsVisitor<?> visitor) {
        visitor.visit(this);
    }
}
