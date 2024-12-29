package com.prowings.basics.loops;

public class ForDemo3 {

	public static void main(String[] args) {
		
		System.out.println("main method started!!!");

		int[] nums = {1,2,3,4,5};
		
		for(int i=0; i<5; i++)
		{
			System.out.println(nums[i]);
		}
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		for(int i=5; i>=0; i--)
		{
			System.out.println(i);
		}
		
		
		
		System.out.println("main method ended!!!");
	}

}
