package model;

import evaluationWithVisitor.ArrayOperationsVisitor;

public class varIn extends Instruction{
    private String ID;

    public varIn(String ID) {
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
