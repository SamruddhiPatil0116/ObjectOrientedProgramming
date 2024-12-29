package com.prowings.basics.loops;

public class NestedForDemo {

	public static void main(String[] args) {
		
		System.out.println("main method started!!!");

		for(int i=1; i<=5; i++)
		{
			
			for(int j=1; j<=3; j++)
			{
				System.out.println(i +" : "+j);
			}
			
		}
		
		System.out.println("main method ended!!!");
	}

}
