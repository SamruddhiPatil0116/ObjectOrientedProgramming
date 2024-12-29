package com.prowings.basics.loops;

public class NestedForBreakDemo {

	public static void main(String[] args) {
		
		System.out.println("main method started!!!");

		for(int i=0; i<5; i++)
		{
			System.out.println("i = "+i);
			
			for(int j=0; j<3; j++)
			{
				if(j==1)
					break;
				System.out.println("j = "+j);
				
			}
			
		}
		
		System.out.println("main method ended!!!");
	}

}
