package com.prowings.basics.controlstatement;

public class IfDemo3 {
	
	public static void main(String[] args) {
		
		int input = 10;
		
		if(isEven(input))
		{
			System.out.println(input +" is even number!!");
		}
		
		System.out.println("-------");
	}

	public static boolean isEven(int n)
	{
		if(n %2 == 0)
		{
			return true;
		}
		else
			return false;
	}
	
}
