package com.gvacharya.printsumofevenandodd;

public class PrintSumOfEvenAndOdd {

	public PrintSumOfEvenAndOdd() {
		
	}
	
	public void sumOddEven(int i, int limit) {
			
		int sumOdd = 0;
		int sumEven = 0;
			
		while(i<=limit) {
				
			if(i % 2 == 0) {
				sumEven += i;
			}else {
				sumOdd += i;
			}
			i++;
		}
		
		System.out.println(sumEven);
		System.out.println(sumOdd);
	}
}
