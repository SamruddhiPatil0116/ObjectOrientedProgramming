package com.prowings.basics.controlstatement;

public class IfDemo {
	
	public static void main(String[] args) {
		
		System.out.println("main method started!!!");
		
//		boolean flag = false;
		
		int age = 21;
		int panNumber = 12345;
		
		if((age>=18)&&(isPanValid(panNumber)))
		{
			System.out.println("eligible for vote!!!");
		}
		
		System.out.println("main method ended!!!");
		
	}

	private static boolean isPanValid(int panNumber) {
		
		boolean res = false;
		
		if(panNumber > 0)
			res = true;
		
		return res;
		
	}

}
