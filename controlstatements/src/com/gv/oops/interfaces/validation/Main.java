package com.gv.oops.interfaces.validation;

import com.gv.oops.interfaces.demo.implementation.main.Validator;


public class Main {
    public static void main(String[] args) {
        Validator validate = new Validator() {
            @Override
            public boolean validateAge(int age) {
                return age > 18;
            }

            @Override
            public boolean validateName(String name) {
                return name.matches("[A-Z][a-z]*");
            }

            @Override
            public boolean validateEmailID(String email) {
                return email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
            }

            @Override
            public boolean validateNumber(String number) {
                return number.matches("\\d+");
            }
        };

        // Test the validator
        String name = "John";
        if (validate.validateName(name)) {
            System.out.println(name + " is a valid name");
        } else {
            System.out.println(name + " is an invalid name");
        }

        String email = "john.doe@example.com";
        if (validate.validateEmailID(email)) {
            System.out.println(email + " is a valid email");
        } else {
            System.out.println(email + " is an invalid email");
        }

        int age = 17;
        if (validate.validateAge(age)) {
            System.out.println(age + " is a valid age");
        } else {
            System.out.println(age + " is an invalid age");
        }

        String number = "123456";
        if (validate.validateNumber(number)) {
            System.out.println(number + " is a valid number");
        } else {
            System.out.println(number + " is an invalid number");
        }
    }
}
