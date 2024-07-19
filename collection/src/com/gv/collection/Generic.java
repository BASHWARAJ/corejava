package com.gv.collection;

import com.gv.collection.entities.Employee;

public class Generic {
 public static void main(String[] args) {
	add(10,20);
	add(1,20);
	add(12,20);
	add(10,30);
	add(10,2);
	add(103,20);
	add(10,40);
	
	Generic1<Integer> intgen=new Generic1<Integer>(10);// syntax before java 1.7
	Generic1<String> stringgen=new Generic1<>("Harshali");// syntax after java 1.7
	Generic1<Employee> employeegen=new Generic1<>(new Employee(1,"Harshali"));// syntax after java 1.7
	
	System.out.println(intgen.getT());
	System.out.println(stringgen.getT());
	System.out.println(employeegen.getT());
	
}
 public static void add (int a, int b) {
	 System.out.println(a+b);
	 
	 
 }
}
