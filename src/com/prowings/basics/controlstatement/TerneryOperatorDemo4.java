package com.prowings.basics.controlstatement;

import java.util.Scanner;

public class TerneryOperatorDemo4 {
	
	public static void main(String[] args) {

		System.out.println("Enter input number : ");
		Scanner sc = new Scanner(System.in);
		
		int inputNumber = sc.nextInt();
		
		System.out.println("You have entered : "+inputNumber);
		
		String result = (inputNumber%2==0) ? "Even Number" : "Odd Number";
		
		System.out.println(inputNumber +" is : "+result);
		
		sc.close();
	}

}
