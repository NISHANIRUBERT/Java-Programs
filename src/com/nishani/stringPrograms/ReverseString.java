package com.nishani.stringPrograms;

public class ReverseString {
	
	public static String reverse(String input) {
		
		if(input == null) {
		    return null;
		}

		char[] chars = input.toCharArray();
		int leftIndex = 0, rightIndex = chars.length -1;
		while(leftIndex<rightIndex){
		    char temp = chars[leftIndex];
		    chars[leftIndex] = chars[rightIndex];
		    chars[rightIndex] = temp;
		    leftIndex++;
		    rightIndex--;
		}
		return new String(chars);
	}

	public static void main(String[] args) {
		
		System.out.println(reverse("automation"));
		
	}

}
