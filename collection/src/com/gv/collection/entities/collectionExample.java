package com.gv.collection.entities;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class collectionExample {
    public static void main(String[] args) {
        // Create an ArrayList of Integer with initial capacity 5
        List<Integer> inList = new ArrayList<>(5);

        // Add elements to the ArrayList
        inList.add(1);
        inList.add(2);
        inList.add(3);
        inList.add(4);

        // Reverse the elements in the list
        Collections.reverse(inList);
        System.out.println("Reversed List: " + inList);

        // Shuffle the elements in the list
        Collections.shuffle(inList);
        System.out.println("Shuffled List: " + inList);

        // Rotate the elements in the list by 1 position to the right
        Collections.rotate(inList, 1);
        System.out.println("Rotated List: " + inList);

        // Binary search for element 2 (requires a sorted list)
        int index = Collections.binarySearch(inList, 2);
        System.out.println("Index of 2: " + index);

        // Find the maximum element in the list
        int max = Collections.max(inList);
        System.out.println("Maximum element: " + max);
    }
}
