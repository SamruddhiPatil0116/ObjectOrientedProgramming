package com.prowings.basics.controlstatement;

public class IfElseIfLadderDemo3 {

	public static void main(String[] args) {
		
		int n1 = 100, n2 = 30, n3 = 55;
		int largest = 0;
		
		// checks if n1 is greater than or equal to n2
	    if (n1 >= n2) {

	      // if...else statement inside the if block
	      // checks if n1 is greater than or equal to n3
	      if (n1 >= n3) {
	        largest = n1;
	      }

	      else {
	        largest = n3;
	      }
	    } else {

	      // if..else statement inside else block
	      // checks if n2 is greater than or equal to n3
	      if (n2 >= n3) {
	        largest = n2;
	      }

	      else {
	        largest = n3;
	      }
	    }

	    System.out.println("Largest Number: " + largest);
	  }	
}
