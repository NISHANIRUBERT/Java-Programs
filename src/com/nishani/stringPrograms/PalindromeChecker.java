package com.nishani.stringPrograms;

public class PalindromeChecker {
	
	public static boolean isPalindrome(String str) {
		
		if(str == null) {
			return false;
		}
		
		str = str.toLowerCase();
		int leftIndex = 0, rightIndex = str.length()-1;
		while(leftIndex<rightIndex) {
			if(str.charAt(rightIndex)!=str.charAt(leftIndex)) {
				return false;
			}
			leftIndex++;
			rightIndex--;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		
		System.out.println(isPalindrome("Madam"));
		
	}	

}
