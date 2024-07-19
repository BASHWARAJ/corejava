package com.gv.streamapi.demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.gv.streamapi.entities.student;

public class App {
	public static void main(String[] args) {
		int [] intArray = {1,3,4,5,7,8,9,4,9};
		
		IntStream intStream = Arrays.stream(intArray);
		
		intStream.filter(no-> no%2==0)
		.map(no->no+1)
		.forEach(no->System.out.println(no));
	
		intStream.close();
		
		student[] studentArray = new student[5];
		
		studentArray[0] = new student(1,"sagar",22);
		studentArray[1] = new student(2,"rahul",20);
		studentArray[2] = new student(3,"harshali",21);
		studentArray[3] = new student(4,"anushka",23);
		studentArray[4] = new student(5,"harish",24);
		
	Stream<student> studentStream =	Arrays.stream(studentArray);
		studentStream.map(obj->obj.getName()).filter(name->name.charAt(1)=='a').forEach(name->System.out.println(name));
		Stream<student> studentStream2 =	Arrays.stream(studentArray);
		studentStream2.filter(obj->obj.getAge()>21).forEach(Age->System.out.println("age greater than 21:"+Age.getAge()));
		
// assignemt print even roll no
		Stream<student> studentStream1 =	Arrays.stream(studentArray);
		studentStream1.map(obj1->obj1.getRollno()).filter(rollno->rollno%2==0).forEach(rollno->System.out.println(rollno));
	
		
		Stream<student> studentStream4 = Arrays.stream(studentArray);
        long count = studentStream4.count();
        System.out.println("Total students: " + count);

        // Find the second minimum age after sorting in reverse order and skipping one element
        studentStream4 = Arrays.stream(studentArray);  // recreate the stream
        Optional<Integer> secondMinAge = studentStream4.map(student::getAge)
                                                       .sorted(Comparator.reverseOrder())
                                                       .distinct()
                                                       .skip(1)
                                                       .min(Integer::compareTo);
        secondMinAge.ifPresent(age -> System.out.println("Second minimum age: " + age));
  
        Stream<student> studentStream3 = Arrays.stream(studentArray);
        String[] nameArray = studentStream3.map(student::getName)
                                           .toArray(String[]::new);

        for (String name : nameArray) {
            System.out.println(name);
        }
	}
}
