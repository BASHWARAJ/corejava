package com.gv.collection.entities;

import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        // Create a Stack to store Employee objects
        Stack<Employee> employeeStack = new Stack<>();

        // Push Employee objects onto the stack
        employeeStack.push(new Employee(1, "Alice"));
        employeeStack.push(new Employee(2, "Bob"));
        employeeStack.push(new Employee(3, "Charlie"));
        employeeStack.push(new Employee(4, "David"));

        // Peek at the top Employee without removing it
        Employee topEmployee = employeeStack.peek();
        System.out.println("Top Employee: " + topEmployee);

        // Pop and print all Employees from the stack
        System.out.println("Employees in Stack:");
        while (!employeeStack.isEmpty()) {
            Employee emp = employeeStack.pop();
            System.out.println(emp);
        }
        
        	
        }
    }

