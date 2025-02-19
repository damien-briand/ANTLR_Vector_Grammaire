package model;

import evaluationWithVisitor.ArrayOperationsVisitor;

public class Affectation<T> extends Instruction {
    private String ID;
    private T value;

    public Affectation(String ID, T value) {
        this.ID = ID;
        this.value = value;
    }

    public String getID() {
        return ID;
    }

    public T getValue() {
        return value;
    }

    @Override
    public Object accept(ArrayOperationsVisitor<?> visitor) {
        return visitor.visit(this);
    }
}
