package com.gv.collection.list;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import com.gv.collection.entities.EmployeeIDComparator;
import com.gv.collection.entities.EmployeeNameComparator;


class Employee implements Comparable<Employee> {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "'}";
    }
}

class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getName().compareTo(e2.getName());
    }
}

public class LinkedListDemo {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Add elements to the LinkedList
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println("Initial LinkedList: " + list);

        // Add an element at a specific position
        list.add(2, "E");
        System.out.println("After adding 'E' at index 2: " + list);

        // Add elements at the beginning and end
        list.addFirst("First");
        list.addLast("Last");
        System.out.println("After adding 'First' and 'Last': " + list);

        // Remove elements
        list.remove("B");
        System.out.println("After removing 'B': " + list);
        list.remove(2);
        System.out.println("After removing element at index 2: " + list);
        list.removeFirst();
        System.out.println("After removing first element: " + list);
        list.removeLast();
        System.out.println("After removing last element: " + list);

        // Access elements
        String firstElement = list.getFirst();
        String lastElement = list.getLast();
        String elementAtIndex2 = list.get(2);
        System.out.println("First Element: " + firstElement);
        System.out.println("Last Element: " + lastElement);
        System.out.println("Element at index 2: " + elementAtIndex2);

        // Check if the list contains an element
        boolean containsC = list.contains("C");
        System.out.println("Does the list contain 'C'? " + containsC);

        // Iterate over the LinkedList
        System.out.print("Iterating over list: ");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // Clear the LinkedList
        list.clear();
        System.out.println("After clearing the list: " + list);

        // Integer LinkedList with ListIterator
        List<Integer> intLinkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4));
        ListIterator<Integer> integerListIterator = intLinkedList.listIterator();

        int i = 0;
        while (integerListIterator.hasNext()) {
            System.out.println(i + ": " + integerListIterator.nextIndex());
            integerListIterator.set(i++);
            integerListIterator.next();
        }
        System.out.println("After iteration and setting values: " + intLinkedList);

        // Employee LinkedList
        List<Employee> employeeList = new LinkedList<>();

        employeeList.add(new Employee(1, "EMP11"));
        employeeList.add(new Employee(2, "EMP12"));
        employeeList.add(new Employee(3, "EMP13"));

        System.out.println("Initial Employee List: " + employeeList);

        // Sort employees by id using Comparable
        Collections.sort(employeeList);
        System.out.println("Sorted by id (using Comparable): " + employeeList);

        // Sort employees by name using Comparator
        Collections.sort(employeeList, new NameComparator());
        System.out.println("Sorted by name (using Comparator): " + employeeList);
        
        
        // Sort employees by name using Comparator
        Collections.sort(employeeList, new NameComparator());
        System.out.println("Sorted by name (using Comparator): " + employeeList);

        // Sort employees by id using EmployeeIDComparator
       // employeeList.sort(new EmployeeIDComparator());
          employeeList.sort((e1,e2)->Integer.compare(e1.getId(), e2.getId()));
        System.out.println("Sorted by id (using EmployeeIDComparator): " + employeeList);

        // Sort employees by name using EmployeeNameComparator
        employeeList.sort((e1,e2)->e1.getName().compareTo(e2.getName()));
        System.out.println("Sorted by name (using EmployeeNameComparator): " + employeeList);
   
    }
}
