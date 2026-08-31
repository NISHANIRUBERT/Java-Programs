package com.nishani.stringPrograms;

import java.util.Arrays;

public class Anagram {
	

	public static boolean isAnagram(String string1, String string2) {
		
		if(string1==null || string2 == null) {
			return false;
		}
		
		string1 = string1.replaceAll("\\s","");
		string2 = string2.replaceAll("\\s","");
		
		if(string1.length() != string2.length()) {
			return false;
		}
		
		char[] charString1 = string1.toLowerCase().toCharArray();
		char[] charString2 = string2.toLowerCase().toCharArray();
		
		Arrays.sort(charString1);
		Arrays.sort(charString2);
		
		return Arrays.equals(charString1,charString2);
	}
	
	public static void main(String[] args) {
		
		System.out.println(isAnagram("silent","Listen"));
		
	}

}
