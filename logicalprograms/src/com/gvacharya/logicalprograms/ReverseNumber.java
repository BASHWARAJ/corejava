package com.gvacharya.logicalprograms;

public class ReverseNumber {

		public static void main(String[] args) {
			
			int number = 123;
			int reverse_number = 0;
			
			while(number!=0) {
				reverse_number = reverse_number * 10 + (number % 10) ;
				number/=10;
			}
			
			System.out.println(reverse_number);
		}
}
