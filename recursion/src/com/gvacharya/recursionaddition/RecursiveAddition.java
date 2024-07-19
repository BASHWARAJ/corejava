package com.gvacharya.recursionaddition;

public class RecursiveAddition {
	
	public int add(int number) {
		
		if(number == 1) {
			return 1;
			//base condition
			//run time error if true always or also called stack overflows
		}
		
		return 5 + add(number-1);
	}
}
