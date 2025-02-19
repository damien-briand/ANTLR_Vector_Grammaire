package model;

import evaluationWithVisitor.ArrayOperationsVisitor;

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

    public String getID() {
        return ID;
    }

    @Override
    public String toString() {
        return "VariableDeclaration{" + "ID=" + ID + ", type=" + type + ", value=" + value + '}' + '\n';
    }

    @Override
    public Object accept(ArrayOperationsVisitor<?> visitor) {
        return visitor.visit(this);
    }
}
