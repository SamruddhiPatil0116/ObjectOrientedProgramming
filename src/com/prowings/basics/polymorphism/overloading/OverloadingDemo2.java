package com.prowings.basics.polymorphism.overloading;

public class OverloadingDemo2 {
	
//	public int m1(int a)
//	{
//		System.out.println("inside m1(int a)");
//		return 40;
//	}
//	public void m1(float a)throws RuntimeException
//	{
//		System.out.println("inside m1(float a)");
//	}
//	public static void m1(long a)
//	{
//		System.out.println("inside m1(long a)");
//	}
	private void m1(Long a)
	{
		System.out.println("inside m1(Long a)");
	}
	public void m1(boolean a)
	{
		System.out.println("inside m1(boolean a)");
	}
//	public void m1(Number a)
//	{
//		System.out.println("inside m1(Number a)");
//	}
//	public void m1(Integer a)
//	{
//		System.out.println("inside m1(Integer a)");
//	}
//	public void m1(Object a)
//	{
//		System.out.println("inside m1(Object a)");
//	}
	
	public static void main(String[] args) {
		
		OverloadingDemo2 obj = new OverloadingDemo2();
		int i = 10;
		Integer j = 10;
		
//		obj.m1(j);
		
	}
	
}
