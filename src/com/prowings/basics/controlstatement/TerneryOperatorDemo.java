package com.prowings.basics.controlstatement;

public class TerneryOperatorDemo {
	
	public static void main(String[] args) {
		
		int result = 0;
		int n1 = 20;
		int n2 = 30;
		
//		if(n1>n2)
//		{
//			result = n1+n2;
//		}
//		else
//		{
//			result = n1-n2;
//		}
		
		result = (n1>n2) ? (n1 + n2) : (n1 - n2);
		
		System.out.println(result);
		
	}

}
