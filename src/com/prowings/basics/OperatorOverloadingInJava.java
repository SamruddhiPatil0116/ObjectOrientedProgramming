package com.prowings.basics;

public class OperatorOverloadingInJava {

	public static void main(String[] args)
	{

		String s1 = "hello";
		String s2 = "world";

		int n1 = 10;
		int n2 = 20;

		System.out.println(s1 + s2);
		System.out.println(n1 + n2);
		System.out.println(s1 + n2 + n1);

		System.out.println(n2 + n1 + s1);
		
	}

}
