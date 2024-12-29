package com.prowings.basics.loops;

public class ForEachDemo {

	public static void main(String[] args) {
		
		System.out.println("main method started!!!");

		int[] nums = {1,2,3,4,5};
		
//		for(int i=0; i<5; i++)
//		{
//			if(nums[i]%2 == 0)
//			System.out.println(nums[i]);
//		}

		for(int n : nums)
		{
			if(n%2 == 0)
			System.out.println(n);
		}
		
		System.out.println("main method ended!!!");
	}

}
