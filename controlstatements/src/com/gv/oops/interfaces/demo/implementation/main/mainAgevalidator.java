package com.gv.oops.interfaces.demo.implementation.main;

import com.gv.oops.interfaces.demo.Validator;
import com.gv.oops.interfaces.demo.implementation.AgeValidator;

public class mainAgevalidator {

	
	    public static void main(String[] args) {
	        Validator validator = new AgeValidator();

	        int age1 = 25;
	        int age2 = 150;

	        System.out.println("Using Age Validator:");
	        System.out.println("Age: " + age1 + " is valid: " + validator.isValid(age1));
	        System.out.println("Age: " + age2 + " is valid: " + validator.isValid(age2));
	    }
	}

