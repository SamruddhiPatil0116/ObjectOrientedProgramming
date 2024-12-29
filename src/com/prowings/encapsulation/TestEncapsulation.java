package com.prowings.encapsulation;

public class TestEncapsulation {
	
	public static void main(String[] args) {
		
//		Student s1 = new Student();
//		s1.rollNo = 20;
//		s1.name = "sham";
//		s1.marks = 67;
//		
//		Student s2 = new Student(10, "Ram", 87);
//		
//		System.out.println("S1 : ");
//		System.out.println(s1.rollNo);
//		System.out.println(s1.name);
//		System.out.println(s1.marks);
//
//		System.out.println("S2 : ");
//		System.out.println(s2.rollNo);
//		System.out.println(s2.name);
//		System.out.println(s2.marks);
		

		Student s1 = new Student();
		
		s1.setRollNo(-10);
		s1.setName("Ram");
		s1.setMarks(97);

		System.out.println(s1.getRollNo());
		System.out.println(s1.getName());
		System.out.println(s1.getMarks());
	}

}
