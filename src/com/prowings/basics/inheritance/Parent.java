package com.prowings.basics.inheritance;

public abstract class Parent {
	
	public Parent()
	{
		super();
	}
	
	public void printHello()
	{
		System.out.println("inside Parent - Hello!!!");
//		printHii();
	}

	private void printHii()
	{
		System.out.println("inside Parent - Hii!!!");
	}

	public abstract void m2();
	
}
