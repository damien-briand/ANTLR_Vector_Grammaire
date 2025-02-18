package model;

import evaluationWithVisitor.StackBasedOperationsVisitor;

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
    public void accept(StackBasedOperationsVisitor<?> visitor) {
        visitor.visit(this);
    }
}
