package com.prowings.basics.loops;

public class SwappingOfTwoNumbers {
	
	public static void main(String[] args) {
		
		int a = 7;
		int b = 5;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		
		System.out.println("<<<<<<< After Swapping >>>>>>>");
		
//		int c = a;
//		a = b;
//		b = c;

		
//		a = a+b;   
//		b = a-b;
//		a = a-b;
		
		a = a*b;
		b = a/b;
		a = a/b;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}

}
