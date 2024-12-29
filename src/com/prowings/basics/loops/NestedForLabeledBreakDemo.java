package com.prowings.basics.loops;

public class NestedForLabeledBreakDemo {

	public static void main(String[] args) {
		
		System.out.println("main method started!!!");

		first:
		for(int i=0; i<10; i++)
		{
			System.out.println("i = "+i);
			
			second:
			for(int j=0; j<5; j++)
			{
				System.out.println("j = "+j);
				
				third:
				for(int k=0;k<3;k++)
				{
					if(k == 2)
						break first;
					System.out.println("k = "+k);
				}
			}
			
		}
		
		System.out.println("main method ended!!!");
	}

}
