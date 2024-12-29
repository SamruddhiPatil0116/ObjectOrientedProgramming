package com.prowings.basics.polymorphism.overloading;

public class OverloadingDemo1 {
	
//	public static void m1(int a)
//	{
//		System.out.println("inside m1(int a)");
//	}

//	public static void m1(Integer a)
//	{
//		System.out.println("inside m1(Integer a)");
//	}
	
//	private static int m1(long a)
//	{
//		System.out.println("inside m1(long a)");
//		return 30;
//	}
//	public final static void m1(float a)
//	{
//		System.out.println("inside m1(float a)");
//	}
//	public static void m1(double a)throws RuntimeException
//	{
//		System.out.println("inside m1(double a)");
//	}
	public static void m1(Long a)
	{
		System.out.println("inside m1(Long a)");
	}

//	public static void m1(Number a)
//	{
//		System.out.println("inside m1(Number a)");
//	}

	public static void m1(Object a)
	{
		System.out.println("inside m1(Object a)");
	}

	public static void main(String[] args) {
		System.out.println("main() started!!");
		int x = 10;
		m1(x);
		System.out.println("main() ended!!");
		
		
	}
	
}
