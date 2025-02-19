package evaluationWithVisitor;

import model.*;

import java.util.*;

public class ArrayOperationDoInterpretVisitor implements ArrayOperationsVisitor<Object>{

    Map<String, Variable<?>> variables;

    public ArrayOperationDoInterpretVisitor() {
        variables = new HashMap<>();
    }

    @Override
    public Integer visit(Program program) {
        for (Instruction instruction : program.instructions) {
            instruction.accept(this);
        }
        return null;
    }

    @Override
    public Integer visit(Max max) {
        return Collections.max(max.getData());
    }

    @Override
    public Integer visit(Min min) {
        return Collections.min(min.getData());
    }

    @Override
    public Integer visit(Prod prod) {
        int result = 1;
        for (int i : prod.getData()) {
            result *= i;
        }
        return result;
    }

    @Override
    public ArrayList<Integer> visit(Sort sort) {
        Collections.sort(sort.getData());
        return sort.getData();
    }

    @Override
    public Integer visit(Sum sum) {
        int result = 0;
        for (int i : sum.getData()) {
            result += i;
        }
        return result;
    }

    @Override
    public Object visit(varOut varOut) {
        System.out.println(variables.get(varOut.getID()).getValue());
        return null;
    }

    @Override
    public Object visit(Affectation<?> affectation) {
        Variable var = variables.get(affectation.getID());
        String type = variables.get(affectation.getID()).getType();

        if (affectation.getValue() instanceof SimpleOp){
            SimpleOp simpleOp = (SimpleOp) affectation.getValue();
            Object result = simpleOp.accept(this);
            var.setValue(result);
        } else {
            Variable<?> variable = new Variable<>(affectation.getID(), type, affectation.getValue());
            variables.put(affectation.getID(), variable);
        }
        return null;
    }

    @Override
    public Object visit(VariableDeclaration<?> variableDeclaration) {
        if (variableDeclaration.getValue() != null) {
            Variable<?> variable = new Variable<>(variableDeclaration.getID(), variableDeclaration.getType(), variableDeclaration.getValue());
            variables.put(variableDeclaration.getID(), variable);
        } else {
            Variable<?> variable = new Variable<>(variableDeclaration.getID(), variableDeclaration.getType());
            variables.put(variableDeclaration.getID(), variable);
        }
        return null;
    }
}
