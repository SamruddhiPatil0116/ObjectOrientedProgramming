package com.prowings.basics.controlstatement;

public class SwitchCaseDemo2 {

	public static void main(String[] args) {
		
		int month = 2;
		int year = 2024;
		int days = 0;
		
		switch(month)
		{
		case 1:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days = 31;
			System.out.println("It has days : "+ days);
			break;
			
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			System.out.println("It has days : "+ days);
			break;
			
		case 2:
			//if year is leap year then initialize days to 29
			days = 28;
			System.out.println("It has days : "+ days);
			break;
			
			default:
				System.out.println("Invalid Month!!");
		}

	}

}
