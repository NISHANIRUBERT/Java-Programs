package com.nishani.stringPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterFrequencyCounter {
	
	public static void countFrequency(String str) {
		
		Map<Character, Integer> charFrequency = new LinkedHashMap<>();
		
		for(char c : str.toLowerCase().toCharArray()) {
			charFrequency.merge(c,1,Integer::sum);
		}
		
		for(Map.Entry<Character,Integer> c: charFrequency.entrySet()) {
			System.out.println(c.getKey()+" : "+c.getValue());
		}
		
	}
	
	public static void main(String[] args) {
		countFrequency("Automation Testing");
	}

}
