package com.prowings.basics.controlstatement;

import java.util.Scanner;

public class IfElseIfLadderDemo {

	public static void main(String[] args) {
		
		System.out.println("Enter marks : ");
		
		Scanner sc = new Scanner(System.in);
		
		int marks = sc.nextInt();

		System.out.println("You have Entered " + marks +" marks");
		
		if((marks>=0) && (marks<=34))
		{
			System.out.println("FAIL!!");
		}
		else if((marks>=35) && (marks<=59))
		{
			System.out.println("SECOND CLASS");
		}
		else if((marks>=60) && (marks<=70))
		{
			System.out.println("FIRST CLASS");
		}
		else if((marks>=71) && (marks<=100))
		{
			System.out.println("FIRST CLASS WITH DISTINCTION!!!");
		}
		else
		{
			System.out.println("INVALID MARKS.. Please enter valid marks!!!");
		}
	}
	
}
