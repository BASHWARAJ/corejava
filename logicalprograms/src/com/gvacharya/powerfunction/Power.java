package com.gvacharya.powerfunction;

public class Power {
	
	private int base;
	private int exponent; 
	
	public Power() {
		
	}
	
	public Power(int base, int exponent) {
		this.base = base;
		this.exponent = exponent;
	}
	
	public int power() {
		
		int i = 1 ;
		int result = 1;
		while(i <= exponent) {
			result = result * base;
			i++;
		}
		
		return result;
	}
	
	
}
