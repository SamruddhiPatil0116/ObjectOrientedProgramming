package com.prowings.basics.loops;

public class ForDemo4 {

	public static void main(String[] args) {
		
		System.out.println("main method started!!!");
		
		for (int i = 1; i <= 20; i += 2) {
		    System.out.println(i);
		}
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

		for (int i=1; i<=20; i++) {
			if(i%2 != 0)
			System.out.println(i);
		}
		
		System.out.println("main method ended!!!");
	}

}
