package model;

import evaluationWithVisitor.StackBasedOperationsVisitor;

public class VariableDeclaration<V> extends Instruction{
    private String ID;
    private String type;
    private V value;

    public VariableDeclaration(String ID, String type) {
        this.ID = ID;
        this.type = type;
    }

    public VariableDeclaration(String ID, String type, V value) {
        this.ID = ID;
        this.type = type;
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "VariableDeclaration{" + "ID=" + ID + ", type=" + type + ", value=" + value + '}' + '\n';
    }

    @Override
    public void accept(StackBasedOperationsVisitor<?> visitor) {
        visitor.visit(this);
    }
}
