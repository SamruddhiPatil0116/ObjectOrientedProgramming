package com.prowings.basics.inheritance;

public class Child extends Parent{
	
	public Child()
	{
		super();
	}
	
	public void m1()
	{
		System.out.println("inside child - m1()!!");
	}

	@Override
	public void m2() {
		
		System.out.println("inside - implemented m2()!!");
		
	}

}
