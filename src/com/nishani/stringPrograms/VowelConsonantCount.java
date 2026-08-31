package com.nishani.stringPrograms;

public class VowelConsonantCount {
	
	
	public static void countVowelConsonant(String str) {
		
		int vowels = 0, consonants = 0;
		String vowelChars = "aeiou";
		for(char c : str.toLowerCase().toCharArray()) {
			if(Character.isLetter(c)) {
				if(vowelChars.indexOf(c)!=-1) {
					vowels++;
				}
				else {
					consonants++;
				}
			}
		}
		
		System.out.println("Vowels count : "+vowels);
		System.out.println("Consonant count: "+ consonants);
		
	}
	
	public static void main(String[] args) {
		
		countVowelConsonant("Height is 147.3 cm");
		
	}

}
