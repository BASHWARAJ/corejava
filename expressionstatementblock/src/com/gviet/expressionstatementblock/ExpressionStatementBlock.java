package com.gviet.expressionstatementblock;

public class ExpressionStatementBlock {

    public static void main(String[] args) {
        int variable1 = 4;

        {
            int number2 = 10;
            int number1 = number2++;
            System.out.println(number1);

        }
        String message = "hello there," +
                        "\" How are you \"";
        String messageblock = """
                             Hello, how are you?
                             """;

        System.out.println(messageblock);
    }
}

