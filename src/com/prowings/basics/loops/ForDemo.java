package com.prowings.basics.loops;

public class ForDemo {

	public static void main(String[] args) {
		
		System.out.println("main method started!!!");

		for (int i=0; i<10; i++) 
		{
			if(i == 5)
				continue;
			System.out.println("Hello : "+i);
		}
		
		System.out.println("main method ended!!!");
	}

}
