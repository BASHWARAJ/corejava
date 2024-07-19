package com.gv.oops.abstraction.mainarithmatic;

import com.gv.oops.abstraction.ArithmaticMethod;
import com.gv.oops.abstraction.Addition;

import com.gv.oops.abstraction.Division;
import com.gv.oops.abstraction.Multiplication;
import com.gv.oops.abstraction.Substraction;

public class Mainop {
	
	public static void main(String[] args) {
		
		ArithmaticMethod add=new Addition();
		System.out.println(add.operation(10, 20));
		
		
		ArithmaticMethod sub=new Substraction();
		System.out.println(sub.operation(10, 20));
		
		ArithmaticMethod mul=new Multiplication();
		System.out.println(mul.operation(10, 20));
		
		ArithmaticMethod div=new Division();
		System.out.println(div.operation(20,10));
	}



}


