package com.gv.exceptionhandling;

public class ExceptionHandlingExample {
	public static void main(String[] args) {
		try {
		division(10,0);
		}catch(ArithmeticException ae) {
		//	System.out.println(ae.toString());
			ae.printStackTrace();
			
			//exception and message
			System.out.println(ae);
			// message
			System.out.println(ae.getMessage());
			
			 StackTraceElement[] elements = ae.getStackTrace();
	            for (StackTraceElement element : elements) {
	                System.out.println(element.getMethodName() + ": " + element);
	            }
	            	
	            }finally {
	            	
	            }
		}

	public static void division (int n1,int n2) {
		System.out.println(n1/n2);
	}
}
