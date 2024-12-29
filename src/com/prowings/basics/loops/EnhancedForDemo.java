package com.prowings.basics.loops;

public class EnhancedForDemo {
	
	public static void main(String[] args) {
		
		int[] numbers = {10,20,30,40,50,60,70,80,90,100};
		int[] numbers1 = {100,60,90,40,50,20,70,80,30,10};
		
		
		for(int i=0; i<10; i++)
		{
			if(numbers1[i] >= 50)
				System.out.println(numbers1[i]);
		}
		
		
	}

}
