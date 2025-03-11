package model;

import java.util.ArrayList;

/**
 * Root class for simple operations
 */
public abstract class SimpleOp extends Instruction {

    // operator not needed because instruction name tells the name of the operator
    // array the operation is performed on
    private ArrayList<Integer> data;

    private String resultType; // result type 'Integer' or 'Array'
    private enum ResultType {INTEGER, ARRAY}

    public SimpleOp() {
        data = new ArrayList<>();
    }

    public SimpleOp(String resultType){
        this.resultType = resultType;
        data = new ArrayList<>();
    }

    public void setData(ArrayList<Integer> data) {
        this.data = data;
    }

    public ArrayList<Integer> getData() {
        return data;
    }

    public String getResultType() {
        return resultType;
    }
}
