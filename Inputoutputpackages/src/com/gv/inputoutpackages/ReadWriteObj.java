package com.gv.inputoutpackages;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.gv.inputoutput.obj.Employee;

import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadWriteObj {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "xyx");

        try (FileOutputStream fos = new FileOutputStream("employee.docx");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(emp1);
            System.out.println("Employee object has been serialized to employee.docx");
        } catch (IOException e) {
            e.printStackTrace();
        }
    
    
    try (FileInputStream fis = new FileInputStream("employee.docx");
            ObjectInputStream ois = new ObjectInputStream(fis)) {
           Employee empFromFile = (Employee) ois.readObject();
           System.out.println("Employee object has been deserialized from employee.docx:");
           System.out.println(empFromFile);
       } catch (IOException | ClassNotFoundException e) {
           e.printStackTrace();
       }
    
}
}
