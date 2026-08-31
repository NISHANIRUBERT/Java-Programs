package com.nishani.arrayPrograms;

public class FindMissingNumber {
	
	public static int findMissing(int[] arr, int i) {
		
		int expected = ((i*(i+1))/2);
		int actual = 0;
		
		for(int num : arr) {
			
			actual = actual + num;
			
		}
		
		return expected - actual;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 4, 5, 6};
		System.out.println("Missing: " + findMissing(arr, 6));
		
	}

	

}
