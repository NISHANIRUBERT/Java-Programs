package com.nishani.arrayPrograms;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateNumbers {
	
	public static Set<Integer> findDuplicates(int[] arr) {
		
		Set<Integer> seen = new HashSet<>();
		Set<Integer> duplicates = new HashSet<>();
		
		for(int num : arr) {
			
			if(!seen.add(num)) {
				duplicates.add(num);
			}
			
		}
		
		return duplicates;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 2, 3, 4, 4, 4, 5};
		System.out.println(findDuplicates(arr));
		
	}

}
