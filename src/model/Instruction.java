package model;
import evaluationWithVisitor.StackBasedOperationsVisitor;
/**
 * In case several types of instruction are developed
 */
public abstract class Instruction {
    public abstract void accept(StackBasedOperationsVisitor<?> visitor);
}
