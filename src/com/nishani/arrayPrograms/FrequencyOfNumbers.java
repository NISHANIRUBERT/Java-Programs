package com.nishani.arrayPrograms;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfNumbers {
	
	public static void countFreq(int[] arr) {
		
		Map <Integer, Integer> frquencyCount = new HashMap<>();
		
		for(int num : arr) {
			
			frquencyCount.merge(num, 1, Integer::sum);
			
		}
		
		System.out.println(frquencyCount);
		
	}
	
	
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 2, 3, 3, 3};
		countFreq(arr);
		
	}

}
