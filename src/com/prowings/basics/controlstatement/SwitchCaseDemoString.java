package com.prowings.basics.controlstatement;

import java.util.Scanner;

public class SwitchCaseDemoString {
	
	public static void main(String[] args) {
		
		System.out.println("Enter Day of the week : ");
		
		Scanner sc = new Scanner(System.in);
		
		String day = sc.next();
		
		switch(day)
		{
		case "Monday":
			System.out.println("its 1st day of week...");
			break;
		case "Tuesday":
			System.out.println("its 2nd day of week...");
			break;
		case "Wednesday":
			System.out.println("its 3rd day of week...");
			break;
		case "Thursday":
			System.out.println("its 4th day of week...");
			break;
		case "Friday":
		case "friday":
			System.out.println("its 5th day of week...");
			break;
		case "Saturday":
			System.out.println("its 6th day of week...");
			break;
		case "Sunday":
			System.out.println("its 6th day of week...");
			break;
			
			default:
				System.out.println("Invalid Day!!!");
		}
	
	
	}

}
