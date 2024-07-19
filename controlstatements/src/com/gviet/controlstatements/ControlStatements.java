// ControlStatements.java
package com.gviet.controlstatements;

public class ControlStatements {
    private boolean expression;

    public ControlStatements() {
        // Default constructor
    }

    public ControlStatements(boolean expression) {
        this.expression = expression;
    }

    public boolean getExpression() {
        return expression;
    }

    public void setExpression(boolean expression) {
        this.expression = expression;
    }

    public void testIf() {
        if (expression) {
            System.out.println("if block");
        }
    }

    public static void testIfElse() {
        boolean expression = true; // Example expression, replace with your logic
        if (expression) {
            System.out.println("if block");
        } else {
            System.out.println("else block");
        }
    }
}
