package com.gvacharya.factorial;

public class RecursiveFactorial {

	public int add(int number) {
		
		if(number == 1) {
			return 1;
			//base condition
			//run time error if true always or also called stack overflows
		}
		
		return number * add(number-1);

	}
}
