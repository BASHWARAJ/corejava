package com.gv.collection.entities;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class vector {
    public static void main(String[] args) {
        // Create a Vector to store Employee objects
        List<Employee> employeeList = new Vector<>();

        // Populate employeeList using Arrays.asList
        List<Employee> employeeList1 = Arrays.asList(
                new Employee(2, "EMP2"),
                new Employee(3, "EMP3"),
                new Employee(4, "EMP4")
        );

        // Add an Employee object manually
        employeeList.add(new Employee(1, "Alice"));

//        // Access and print the first Employee in employeeList
//        Employee emp1 = employeeList.get(0);
//        System.out.println(emp1);
//
//        // Add all elements from employeeList1 to employeeList
//        employeeList.addAll(employeeList1);
//
//        // Remove an Employee by index
//        employeeList.remove(1); // Removes the second element (index 1)
//
//        // Remove Employees with name "EMP3" using removeIf
//        employeeList.removeIf(e -> e.getName().equals("EMP3"));
//
//        // Print all Employees in employeeList using forEach
//        employeeList.forEach(System.out::println);
//        
        employeeList.retainAll(employeeList1);
        System.out.println(employeeList);
    }
}
