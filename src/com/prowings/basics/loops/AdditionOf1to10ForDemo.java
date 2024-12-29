package com.prowings.basics.loops;

public class AdditionOf1to10ForDemo {

	public static void main(String[] args) {
		
		System.out.println("main method started!!!");

		int result = 0;
		
		for (int i=1; i<10; i++) 
		{
			result += i;
		}
		
		System.out.println("Addition of 1 to 10 : "+ result);
		System.out.println("main method ended!!!");
	}

}
