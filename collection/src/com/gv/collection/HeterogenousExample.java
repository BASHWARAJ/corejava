package com.gv.collection;

import java.util.ArrayList;
import java.util.List;
import com.gv.collection.entities.Employee;

public class HeterogenousExample {
    public static void main(String[] args) {
        // Correcting the list initialization and type
        List<Object> list = new ArrayList<>(5);
        list.add(10);
        list.add("abc");
        list.add(new Employee(1, "EMP1"));
        System.out.println(list);

        // Correcting the array initialization
        int[] intArray = {1, 2, 3};
        int length = intArray.length;
        
        // Printing the array length for verification
        System.out.println("Length of intArray: " + length);
    }
}
