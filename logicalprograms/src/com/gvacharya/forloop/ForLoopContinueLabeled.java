package com.gvacharya.forloop;

public class ForLoopContinueLabeled {

	public static void main(String[] args) {
		
		int i;
		int j;
		
		mark:
		for (j=1;j<=10;j++) {
			// traditional for loop
			for (i=1;i<=10;i++) {
				
				if(i%2==0) {
					continue mark; //label mark. break also shares this label concept.
				}
				System.out.println(j + "*" + i + "=" + (j*i));
			}
		
		}
	}
}
