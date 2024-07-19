package com.gvacharya.logicalprograms;

public class PalindromeNumber {

	
	public static void main(String[] args) {
		
		int number = 121;
		int number1 = 121;
		int reverse_number = 0;
		
		while(number!=0) {
			reverse_number = reverse_number * 10 + (number % 10) ;
			number/=10;
		}
		
		System.out.println(reverse_number);
		
		if(number1 == reverse_number ) {
		System.out.println("Palindrome");
		}
	}
}
