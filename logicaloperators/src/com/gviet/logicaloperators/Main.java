package com.gviet.logicaloperators;

public class Main {
    // Main.java

    public static void main(String[] args) {
        // Create an object of LogicalOperators
    	LoglicOperators obj = new LoglicOperators();

        // Set values of operand1 and operand2 using setter methods
        obj.setOperand1(12);
        obj.setOperand2(20);

        // Perform logical operations
        obj.performLogicalOperations();

        // Demonstrate getter and setter methods
        System.out.println("\nDemonstrating Getter and Setter Methods:");
        System.out.println("Previous Operand 1: " + obj.getOperand1());
        System.out.println("Previous Operand 2: " + obj.getOperand2());

        // Modify operands using setter methods
        obj.setOperand1(obj.getOperand1() + 1); // Increment operand1
        obj.setOperand2(obj.getOperand2() - 1); // Decrement operand2

        // Perform logical operations again after modification
        System.out.println("\nPerforming Logical Operations after Modification:");
        obj.performLogicalOperations();
    }
}