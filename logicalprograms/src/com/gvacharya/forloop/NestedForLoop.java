package com.gvacharya.forloop;

public class NestedForLoop {

	public static void main(String[] args) {
		
		int i;
		int j;
		
		
		for (j=1;j<=10;j++) {
			// traditional for loop
			for (i=1;i<=10;i++) {
				System.out.println(j + "*" + i + "=" + (j*i));
			}
		
		}
	}
}
