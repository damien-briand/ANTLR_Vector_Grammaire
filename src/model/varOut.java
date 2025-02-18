package model;

import evaluationWithVisitor.StackBasedOperationsVisitor;

public class varOut extends Instruction{
    private String ID;

    public varOut(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    @Override
    public void accept(StackBasedOperationsVisitor<?> visitor) {
        visitor.visit(this);
    }
}
