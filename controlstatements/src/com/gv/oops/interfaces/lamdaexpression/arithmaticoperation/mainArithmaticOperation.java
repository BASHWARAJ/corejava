package com.gv.oops.interfaces.lamdaexpression.arithmaticoperation;
import com.gv.oops.interfaces.lamdaexpression.arithmaticoperation.Arithmaticoperation;
 public class mainArithmaticOperation {
	public static void main (String [] args) {
		Arithmaticoperation add = (int n1 , int n2)->n1+n2;
		
		Arithmaticoperation sub = (int n1 , int n2)->n1-n2;
		Arithmaticoperation multiplication = (int n1 , int n2)->n1*n2;
		Arithmaticoperation division = (int n1 , int n2)->n1/n2;
		
		System.out.println(add.operation(10,20));
		System.out.println(sub.operation(10,20));
		System.out.println(multiplication.operation(10,20));
		System.out.println(division.operation(10,20));
		
	}
}
