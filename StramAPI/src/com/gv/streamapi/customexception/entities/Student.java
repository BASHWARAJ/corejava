package com.gv.streamapi.customexception.entities;

public class Student {
    private int id;
    private String name;
    
    // Constructor
    public Student(int id, String name) {
        if(id <= 0) {
            throw new InvalidException("ID must be greater than 0.");
        }
        this.id = id;
        this.name = name;
    }
    
    // Getters
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    // Setters
    public void setId(int id) {
        if(id > 0) {
            this.id = id;
        } else {
            throw new InvalidException("ID must be greater than 0.");
        }
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }
}
