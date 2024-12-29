package com.prowings.basics.polymorphism.overloading;

public class OverloadingDemo3 {
	
//	public void m1(int a, int b)
//	{
//		System.out.println("inside m1(int,int)");
//	}

//	public void m1(int a, long b)
//	{
//		System.out.println("inside m1(int,long)");
//	}

	public void m1(long a, long b)
	{
		System.out.println("inside m1(long,long)");
	}

	public void m1(long a, int b)
	{
		System.out.println("inside m1(long,int)");
	}

	public static void main(String[] args) {
		
		OverloadingDemo3 obj = new OverloadingDemo3();
		
		obj.m1(10, 10);
		
	}
	
}
