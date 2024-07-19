// MainControlStatement.java
package com.gviet.maincontrolstatements;

import com.gviet.controlstatements.ControlStatements;

public class mainControlStatement {

    public static void main(String[] args) {
        int variable1 = 10;
        int variable2 = 20;
        int variable3 = 30;

        ControlStatements conditionalStatement = new ControlStatements();
        conditionalStatement.testIf();

        if (variable1 < variable2) {
            System.out.println("variable1 is less than variable2"); // Added message
        }

        ControlStatements conditionalStatement1 = new ControlStatements();
        conditionalStatement1.setExpression((variable1 < variable2) && (variable1 < variable3));
        conditionalStatement1.testIf();

        ControlStatements.testIfElse();
    }
}
