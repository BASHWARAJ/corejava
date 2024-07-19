package com.gvacharya.forloop;

public class ForLoopContinue {

		public static void main(String[] args) {
			
			//continue - skips current  iteration 
			// type - label and unlabeled
			// label skips entire nested loop- inner as well as outer
			// Unlabeled skips inner loop only
			
			int i;
			int n = 3;
			// traditional for loop
			System.out.println("Odd Table");
			for (i=1;i<=10;i++) {
				
				if(i%2==0) {
					//odd
					continue;
				}
				System.out.println(n + "*" + i + "=" + (n*i));
			}
			
			System.out.println("----------------------");
			System.out.println("Even Table");
			
			for (i=1;i<=10;i++) {
				
				if(i%2!=0) {
					//even
					continue;
				}
				System.out.println(n + "*" + i + "=" + (n*i));
			}
			
			
			
			// return  - returns value to the calling function
			// statements below return statement wont be executed
			// constructor does not return any value. not even void.
			// using return inappropriately makes code unreachable
		}
}
