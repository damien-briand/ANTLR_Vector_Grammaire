package evaluationWithVisitor;

import model.*;

import java.util.Collections;
import java.util.Stack;

public class StackBasedOperationsDoInterpretVisitor implements StackBasedOperationsVisitor<Object>{

    private Stack<Double> stack;

    public StackBasedOperationsDoInterpretVisitor() {
        stack = new Stack<>();
    }

    @Override
    public Object visit(Program program) {
        for (Instruction instruction : program.instructions) {
            instruction.accept(this);
        }
        if (!stack.isEmpty()) {
            if (stack.size() > 1) {
                return stack;
            } else {
                return stack.pop();
            }
        } else {
            throw new IllegalStateException("Stack is empty, cannot pop.");
        }
    }

    @Override
    public Object visit(Max max) {
        int maxVal = max.getData().get(0);
        for (int i = 1; i < max.getData().size(); i++) {
            if (max.getData().get(i) > maxVal) {
                maxVal = max.getData().get(i);
            }
        }
        stack.push((double) maxVal);
        return null;
    }

    @Override
    public Object visit(Min min) {
        int minVal = min.getData().get(0);
        for (int i = 1; i < min.getData().size(); i++) {
            if (min.getData().get(i) < minVal) {
                minVal = min.getData().get(i);
            }
        }
        stack.push((double) minVal);
        return null;
    }

    @Override
    public Object visit(Prod prod) {
        int result = 1;
        for (int i = 0; i < prod.getData().size(); i++) {
            result = result * prod.getData().get(i);
        }
        stack.push((double) result);
        return null;
    }

    @Override
    public Object visit(Sort sort) {
        Collections.sort(sort.getData());
        for (int i = 0; i < sort.getData().size(); i++) {
            stack.push((double) sort.getData().get(i));
        }
        return null;
    }

    @Override
    public Object visit(Sum sum) {
        int result = 0;
        for (int i = 0; i < sum.getData().size(); i++) {
            result = result + sum.getData().get(i);
        }
        stack.push((double) result);
        return null;
    }

    @Override
    public Object visit(varOut vo) {
        return null;
    }

    @Override
    public Object visit(Affectation<?> affectation) {
        return null;
    }

    @Override
    public Object visit(VariableDeclaration<?> variableDeclaration) {
        return null;
    }
}
