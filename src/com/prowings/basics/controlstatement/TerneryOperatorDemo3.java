package com.prowings.basics.controlstatement;

public class TerneryOperatorDemo3 {
	
	public static void main(String[] args) {

		int x = 25;
		int y = 20;
		int z = 15;

		int max = (x > y) ? (x > z ? x : z) : (y > z ? y : z);		
		
		
		System.out.println("Max Number is : "+max);
		
		
	}

}
