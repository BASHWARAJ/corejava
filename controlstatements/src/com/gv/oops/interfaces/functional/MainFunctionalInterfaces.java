package com.gv.oops.interfaces.functional;

import java.util.function.Consumer;

public class MainFunctionalInterfaces {
    
    // Correctly defining the student class
    public static class Student {
        private int rollno;
        private String name;

        // Constructor to initialize student objects
        public Student(int rollno, String name) {
            this.rollno = rollno;
            this.name = name;
        }

        // Overriding toString method for meaningful print output
        @Override
        public String toString() {
            return "Student [rollno=" + rollno + ", name=" + name + "]";
        }
    }

    public static void main(String[] args) {
        
        // Creating student instances
        Student std1 = new Student(1, "abc");
        Student std2 = new Student(2, "def");
        Student std3 = new Student(3, "ghi");
        Student std4 = new Student(4, "jkl");

        // Consumer to print student details
        Consumer<Student> printStudent = System.out::println;

        // Consumer to check if a number is odd or even
        Consumer<Integer> oddEven = number -> {
            if (number % 2 == 0)
                System.out.println(number + " is even");
            else
                System.out.println(number + " is odd");
        };

        // Consumers to print float amounts
        Consumer<Float> consumer = amount -> System.out.println(amount);
        consumer.accept(12.00f);
        consumer.accept(12345.00f);
        consumer.accept(12465778.00f);
        consumer.accept(13345568789890.00f);
        
        // Printing student details using the consumer
        printStudent.accept(std1);
        printStudent.accept(std2);
        printStudent.accept(std3);
        printStudent.accept(std4);

        // Using oddEven consumer
        oddEven.accept(10);
        oddEven.accept(15);
    }
}
