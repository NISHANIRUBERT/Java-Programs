package com.nishani.arrayPrograms;

public class SecondLargestNumber {
	
	public static int secondLargest(int[] arr) {
		
		int secondLargestNum = Integer.MIN_VALUE;
		int firstLargestNum = Integer.MIN_VALUE;
		
		for(int num : arr) {
			
			if(num > firstLargestNum) {
				secondLargestNum = firstLargestNum;
				firstLargestNum = num;
			}
			else if(num > secondLargestNum && num != firstLargestNum) {
				secondLargestNum = num;
			}
			
		}
		
		
		return secondLargestNum;
		
	}
	
	public static void main(String[] args) {
		
		int[] arr = {3, 7, 2, 9, 4};
		System.out.println("Second largest: " + secondLargest(arr));
		
	}

	

}
