package com.nishani.searchingAndsorting;

public class BinarySearch {
	
	public static int search(int[] arr, int targetNumber) {
		
		int low = 0, high = arr.length -1;
		
		while(low<=high) {
			
			int mid = low+(high-low)/2;
			if(arr[mid] == targetNumber) {
				return mid;
			}
			
			else if(arr[mid] < targetNumber) {
				low = mid+1;
			}
			
			else {
				high = mid -1;
			}
			
		}
		
		return -1;
		
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1, 3, 5, 7, 9, 11};
		System.out.println("Found at index: " + search(arr, 7));
		
	}

}
