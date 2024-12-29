package com.prowings.basics.polymorphism.overloading;

public class VarArgDemo {

//	public void m1(int i)
//	{
//		System.out.println("inside m1(int i)");
//	}

//	public void m1(long i)
//	{
//		System.out.println("inside m1(long i)");
//	}

//	public void m1(Integer i)
//	{
//		System.out.println("inside m1(Integer i)");
//	}
	
	//var-arg method
	public void m1(int ... a) //equivalent to m1(int[] a)
	{
		System.out.println("inside m1(int ... a)");
		
		for(int n : a)
		{
			System.out.println(n);
		}
	}
	
	
	public static void main(String[] args) {
		
		VarArgDemo obj = new VarArgDemo();
		
		obj.m1(10);
		
	}

}
