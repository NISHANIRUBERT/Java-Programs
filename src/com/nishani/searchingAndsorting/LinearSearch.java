package com.nishani.searchingAndsorting;

public class LinearSearch {
	
	public static int search(int[] arr, int targetNumber) {
		
		for(int index = 0; index<arr.length; index++) {
			
			if(arr[index] == targetNumber) {
				return index; 
			}
			
		}
		
		return -1;
		
	}
	
	public static void main(String[] args) {
		
		int[] arr = {2, 4, 6, 8, 10};
		System.out.println("Found at index: " + search(arr, 8));
		
	}

}
