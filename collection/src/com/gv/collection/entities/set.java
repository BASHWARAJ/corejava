package com.gv.collection.entities;

import java.util.Set;
import java.util.HashSet;


public class set {
    public static void main(String[] args) {
        // Create a HashSet to store Integer elements
//        Set<Integer> inset = new HashSet<>();
//
//        // Add elements to the HashSet
//        inset.add(1);
//        inset.add(4);
//        inset.add(2);
//        inset.add(1);
//        inset.add(3);
//        inset.add(4);
//
//        // Print the size of the HashSet
//        System.out.println("Size of the set: " + inset.size());
//        
//        
//        inset.forEach(System.out::println);
    	
    	Set<Employee> employeeSet= new HashSet <>();
    	employeeSet.add(new Employee(1,"Sagar"));
    	employeeSet.add(new Employee(1,"Sagar"));
    	employeeSet.add(new Employee(1,"Sagar"));
    	employeeSet.add(new Employee(1,"Sagar"));
    	System.out.println(new Employee(1,"Sagar").hashCode());
    	System.out.println(new Employee(1,"Sagar").hashCode());
    	System.out.println(new Employee(1,"Sagar").hashCode());
    	System.out.println(employeeSet);
    	
   }
}

