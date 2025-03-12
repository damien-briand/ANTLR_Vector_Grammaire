package evaluationWithVisitor;

import model.*;

import java.util.*;

public class ArrayOperationDoInterpretVisitor implements ArrayOperationsVisitor<Object>{

    Map<String, Variable<?>> variables;

    public ArrayOperationDoInterpretVisitor() {
        variables = new HashMap<>();
    }

    // Getters
    @Override
    public Integer visit(Program program) {
        for (Instruction instruction : program.instructions) {
            instruction.accept(this);
        }
        return null;
    }

    /**
     * Visits a Max node and computes the maximum value from the data list.
     *
     * @param max the Max node to visit
     * @return the maximum value in the data list
     */
    @Override
    public Integer visit(Max max) {
        return Collections.max(max.getData());
    }

    /**
     * Visits a Min node and computes the minimum value from the data list.
     *
     * @param min the Min node to visit
     * @return the minimum value in the data list
     */
    @Override
    public Integer visit(Min min) {
        return Collections.min(min.getData());
    }

    /**
     * Visits a Prod node and computes the product of all the values in the data list.
     *
     * @param prod the Prod node to visit
     * @return the product of all the values in the data list
     */
    @Override
    public Integer visit(Prod prod) {
        int result = 1;
        for (int i : prod.getData()) {
            result *= i;
        }
        return result;
    }

    /**
     * Visits a Sort node and sorts the data list in ascending order.
     *
     * @param sort the Sort node to visit
     * @return the sorted data list
     */
    @Override
    public ArrayList<Integer> visit(Sort sort) {
        Collections.sort(sort.getData());
        return sort.getData();
    }

    /**
     * Visits a Sum node and computes the sum of all the values in the data list.
     *
     * @param sum the Sum node to visit
     * @return the sum of all the values in the data list
     */
    @Override
    public Integer visit(Sum sum) {
        int result = 0;
        for (int i : sum.getData()) {
            result += i;
        }
        return result;
    }

    /**
     * Visits a varOut node and prints the value of the variable with the given ID.
     *
     * @param varOut the varOut node to visit
     * @return null
     */
    @Override
    public Object visit(varOut varOut) {
        System.out.println(variables.get(varOut.getID()).getValue());
        return null;
    }

    /**
     * Visits an Affectation node and updates the variable with the given ID.
     * If the value is a SimpleOp, it evaluates the operation and sets the result as the variable's value.
     * Otherwise, it creates a new variable with the given value.
     *
     * @param affectation the Affectation node to visit
     * @return null
     */
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

    /**
     * Visits a VariableDeclaration node and creates a new variable with the given ID and type.
     * If the value is provided, it initializes the variable with the given value.
     * Otherwise, it creates an uninitialized variable.
     *
     * @param variableDeclaration the VariableDeclaration node to visit
     * @return null
     */
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
