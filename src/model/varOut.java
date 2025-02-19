package model;

import evaluationWithVisitor.ArrayOperationsVisitor;

public class varOut extends Instruction{
    private String ID;

    public varOut(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    @Override
    public Object accept(ArrayOperationsVisitor<?> visitor) {
        return visitor.visit(this);
    }
}
