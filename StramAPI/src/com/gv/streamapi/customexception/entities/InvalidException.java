package com.gv.streamapi.customexception.entities;

public class InvalidException extends RuntimeException {
    public InvalidException(String message) {
        super(message);
    }

public static void main(String[] args) {
    try {
        Student student = new Student(0, null);
        System.out.println(student);
    } catch (InvalidException e) {
        System.out.println("Exception caught: " + e.getMessage());
    }
}
}