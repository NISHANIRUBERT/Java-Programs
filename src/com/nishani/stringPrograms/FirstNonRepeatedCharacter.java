package com.nishani.stringPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {
	
	private static Character firstUniqueCharacter(String string) {
		
		Map<Character, Integer> frequency = new LinkedHashMap<>();
		
		for(char c : string.toLowerCase().toCharArray()) {
			frequency.merge(c,1,Integer::sum);
		}
		
		for(Map.Entry<Character, Integer> c : frequency.entrySet()) {
			if(c.getValue()==1) {
				return c.getKey();
			}
		}
		return null;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("First non repeating character is : "+ firstUniqueCharacter("Automation"));
		
	}


}
