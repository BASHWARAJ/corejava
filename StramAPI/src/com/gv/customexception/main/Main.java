package com.gv.customexception.main;

import com.gv.streamapi.customexception.entities.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(0, null);
        
        student.setId(0);
        student.setName(null);
        
        // Handling null name to avoid NullPointerException
        if (student.getName() == null) {
            System.out.println("Student name is not set.");
        } else {
            System.out.println(student);
        }
    }
}
