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
        System.out.println(varOut.getID() + " = " + variables.get(varOut.getID()).getValue());
        return null;
    }

    /**
        * Visits a varIn node and prompts the user to enter a value for the variable with the given ID.
        * If the variable is an array, the user is prompted to enter a list of values.
        * The variable is then created and added to the symbol table.
        * @param varIn the varIn node to visit
        * @return null
     */
    @Override
    public Object visit(varIn varIn) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value for " + varIn.getID() + ": ");
        if (variables.get(varIn.getID()).getType().equals(Variable.Type.INT.toString().toLowerCase())) {
            int value;
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter an integer value.");
                scanner.nextLine();
            }
            value = scanner.nextInt();
            Variable<?> variable = new Variable<>(varIn.getID(), "int", value);
            variables.put(varIn.getID(), variable);
        } else {
            String value = scanner.next();
            while (value.length() == 0 || !value.startsWith("[") || !value.endsWith("]") || !value.contains(",")) {
                System.out.println("Please enter a list of integer values.");
                value = scanner.nextLine();
            }
            String[] values = value.substring(1, value.length() - 1).split(",");
            ArrayList<Integer> data = new ArrayList<>();
            for (String s : values) {
                data.add(Integer.parseInt(s));
            }
            Variable<?> variable = new Variable<>(varIn.getID(), Variable.Type.ARRAY.toString().toLowerCase(), data);
            variables.put(varIn.getID(), variable);
        }
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
        } else if (affectation.getValue() instanceof String) {
            Variable var2 = variables.get(affectation.getValue());
            Variable<?> variable = new Variable<>(affectation.getID(), type, var2.getValue());
            variables.put(affectation.getID(), variable);
        }
        else {
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
            if (variableDeclaration.getValue() instanceof SimpleOp) {
                SimpleOp simpleOp = (SimpleOp) variableDeclaration.getValue();
                Object result = simpleOp.accept(this);
                Variable<?> variable = new Variable<>(variableDeclaration.getID(), variableDeclaration.getType(), result);
                variables.put(variableDeclaration.getID(), variable);
            } else {
                Variable<?> variable = new Variable<>(variableDeclaration.getID(), variableDeclaration.getType(), variableDeclaration.getValue());
                variables.put(variableDeclaration.getID(), variable);
            }
        } else {
            Variable<?> variable = new Variable<>(variableDeclaration.getID(), variableDeclaration.getType());
            variables.put(variableDeclaration.getID(), variable);
        }
        return null;
    }
}
