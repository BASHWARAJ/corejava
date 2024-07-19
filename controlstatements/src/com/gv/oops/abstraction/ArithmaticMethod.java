package com.gv.oops.abstraction;



public abstract class ArithmaticMethod {
	
	int num1;
	int num2;
	
	
	
	public ArithmaticMethod() {
		super();
		// TODO Auto-generated constructor stub
	}



	public ArithmaticMethod(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}



	public int getNum1() {
		return num1;
	}



	public void setNum1(int num1) {
		this.num1 = num1;
	}



	public int getNum2() {
		return num2;
	}



	public void setNum2(int num2) {
		this.num2 = num2;
	}



	public abstract int operation(int num1, int num2);



	@Override
	public String toString() {
		return "ArithmaticMethod [num1=" + num1 + ", num2=" + num2 + ", getNum1()=" + getNum1() + ", getNum2()="
				+ getNum2() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	




}



	






	
	