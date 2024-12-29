package com.prowings.basics.polymorphism.overloading;

public class OverloadingDemo4 {
	
	public void m1(String s)
	{
		System.out.println("inside m1(string)");
	}

//	public void m1(StringBuffer s)
//	{
//		System.out.println("inside m1(StringBuffer)");
//	}

//	public void m1(Number n)
//	{
//		System.out.println("inside m1(Number)");
//	}

//	public void m1(Integer n)
//	{
//		System.out.println("inside m1(Integer)");
//	}
//
	public void m1(Long n)
	{
		System.out.println("inside m1(Long)");
	}

	public void m1(Object o)
	{
		System.out.println("inside m1(Object)");
	}

	public static void main(String[] args) {
		
		OverloadingDemo4 obj = new OverloadingDemo4();
		
//		String s = "Hello";
		
		//obj.m1(null);
		
	}
	
}
