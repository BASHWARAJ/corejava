package collectioncollectorassignment;

import java.util.Collections;
import java.util.LinkedList;

public class StudentListDemo {
    public static void main(String[] args) {
        // Create a LinkedList of Student
        LinkedList<Student> studentList = new LinkedList<>();

        // Add Student objects to the list
        studentList.add(new Student("Alice", 3, 1500));
        studentList.add(new Student("Bob", 1, 1200));
        studentList.add(new Student("Charlie", 2, 1300));
        studentList.add(new Student("David", 4, 1400));

        System.out.println("Initial Student List: " + studentList);

        // Sort by natural order (rollNo) using Comparable
        Collections.sort(studentList);
        System.out.println("Sorted by rollNo (using Comparable): " + studentList);

        // Sort by name using Comparator
        studentList.sort(new StudentNameComparator());
        System.out.println("Sorted by name (using Comparator): " + studentList);

        // Sort by rollNo using Comparator
        studentList.sort(new StudentRollNoComparator());
        System.out.println("Sorted by rollNo (using Comparator): " + studentList);

        // Sort by fees using Comparator
        studentList.sort(new StudentFeesComparator());
        System.out.println("Sorted by fees (using Comparator): " + studentList);
    }
    
}