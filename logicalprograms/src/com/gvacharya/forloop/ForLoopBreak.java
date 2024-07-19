package com.gvacharya.forloop;

public class ForLoopBreak {

	public static void main(String[] args) {
		
		int i;
		int n = 2;
		// traditional for loop
		for (i=1;i<=10;i++) {
			
			if((i*2)==16) {
				// exits loop statement if condition is true
				break;
			}
			System.out.println(n + "*" + i + "=" + (n*i));
		}
	}
}
