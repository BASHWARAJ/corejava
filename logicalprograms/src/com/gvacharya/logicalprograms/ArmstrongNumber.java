package com.gvacharya.logicalprograms;

public class ArmstrongNumber {

		public static void main(String[] args) {
			
			int i = 1;
			int number1 = 153;
			int armstrongNumber = 153;
			int result = 0;
			
			while (i<=3) {
				
				// Expression promotion
				result += Math.pow((number1%10),(3));
				number1/=10;
				i++;
				
			}
	
			System.out.println(result);
			
			if(armstrongNumber == result) {
				System.out.println("Armstrong Number");
			}else {
				System.out.println("Not a Armstrong Numebr");
			}
		}
}
