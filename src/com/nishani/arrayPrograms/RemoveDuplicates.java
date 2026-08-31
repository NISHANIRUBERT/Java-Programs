package com.nishani.arrayPrograms;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	
	public static void removeDuplicates(int[] arr) {
		
		Set <Integer> uniqueNumbers = new LinkedHashSet<>();
		for(int num : arr) {
			uniqueNumbers.add(num);
		}
		
		System.out.println(uniqueNumbers);
		
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 2, 3, 4, 4, 5};
		removeDuplicates(arr);
		
	}

	

}
