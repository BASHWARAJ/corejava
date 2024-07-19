package com.gviet.logicaloperators;

public class LoglicOperators {
    // Instance variables declared at the class level
    private int operand1;
    private int operand2;

    // Setter methods for operands
    public void setOperand1(int operand1) {
        this.operand1 = operand1;
    }

    public void setOperand2(int operand2) {
        this.operand2 = operand2;
    }

    // Getter methods for operands
    public int getOperand1() {
        return operand1;
    }

    public int getOperand2() {
        return operand2;
    }

    // Method to perform logical operations using getter methods
    void performLogicalOperations() {
        boolean andResult = (getOperand1() != 0) && (getOperand2() != 0);
        boolean orResult = (getOperand1() != 0) || (getOperand2() != 0);
        boolean notResult1 = (getOperand1() == 0);
        boolean notResult2 = (getOperand2() == 0);

        System.out.println("Operand 1: " + getOperand1());
        System.out.println("Operand 2: " + getOperand2());
        System.out.println("AND Result: " + andResult);
        System.out.println("OR Result: " + orResult);
        System.out.println("NOT Operand 1: " + notResult1);
        System.out.println("NOT Operand 2: " + notResult2);
    }
}
