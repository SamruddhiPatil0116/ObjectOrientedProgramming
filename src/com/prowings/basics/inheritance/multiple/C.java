package com.prowings.basics.inheritance.multiple;

public class C extends A implements B{

	public int m1()
	{
		System.out.println("inside m1() method!!");
		return 10;
	}

	@Override
	public void m1(long x) {
		System.out.println("inside m1(long) method!!");
		
	}
}
