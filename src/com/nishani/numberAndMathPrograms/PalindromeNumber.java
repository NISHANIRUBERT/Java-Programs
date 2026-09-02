package com.nishani.numberAndMathPrograms;

public class PalindromeNumber {
	
	public static boolean isPalindrome(int num) {
		
		if(num < 0) return false;
		
		int reverse = 0, original = num;
		
		while(num > 0) {
			
			reverse = reverse * 10 + num%10;
			num = num/10;
		}
		
		return reverse == original;
	}
	
	public static void main(String[] args) {
		
		System.out.println("12321 is palindrome: " + isPalindrome(12321));
		
	}

}
