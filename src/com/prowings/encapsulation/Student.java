package com.prowings.encapsulation;

public class Student {
	
	private int rollNo;
	private String name;
	private int marks;

	public Student() {
		super();
	}

	public Student(int rollNo, String name, int marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}

	//getter method
	public int getRollNo()
	{
		return this.rollNo;
	}
	
	//setter method
	public void setRollNo(int rn)
	{
		if(rn>0)
		this.rollNo = rn;
		else
			System.out.println("invalid roll number..");
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String nm)
	{
		this.name = nm;
	}
	
	public int getMarks()
	{
		return this.marks + 10;
	}
	
	public void setMarks(int mrks)
	{
		this.marks = mrks;
	}
}
