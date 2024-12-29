package com.prowings.basics.controlstatement;

import java.util.Scanner;

public class IfElseIfLadderDemo2 {

	public static void main(String[] args) {
		
		System.out.println("Enter marks : ");
		
		Scanner sc = new Scanner(System.in);
		
		int marks = sc.nextInt();

		System.out.println("You have Entered " + marks +" marks");
		
		if((marks>=0) && (marks==34))
		{
			System.out.println("FAIL!!");
		}
		else if((marks>=34) && (marks<=59))
		{
			System.out.println("SECOND CLASS");
		}
		else
		{
			System.out.println("INVALID MARKS.. Please enter valid marks!!!");
		}
	}
	
}
