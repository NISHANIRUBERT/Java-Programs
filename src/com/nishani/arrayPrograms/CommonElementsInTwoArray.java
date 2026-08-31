package com.nishani.arrayPrograms;

import java.util.HashSet;
import java.util.Set;

public class CommonElementsInTwoArray {
	
	public static Set<Integer> commonIntegers(int[] arr1, int[] arr2){
		
		Set<Integer> array1 = new HashSet<>();
		Set<Integer> result = new HashSet<>();
		
		for(int n : arr1) {
			
			array1.add(n);
			
		}
		
		for(int n : arr2) {
			
			if(array1.contains(n)) {
				result.add(n);
			}
			
		}
		
		return result;
		
	}
	
	public static void main(String[] args) {
		
		int[] a = {1, 2, 3, 4};
		int[] b = {3, 4, 5, 6};
		System.out.println(commonIntegers(a, b));
		
	}

}
