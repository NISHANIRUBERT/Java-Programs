package com.nishani.numberAndMathPrograms;

public class PowerOfTwo {
	
	public static boolean isPowerOfTwo(int num) {
		
		return((num>0)&&((num&(num-1))==0));
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("64 is power of two: " + isPowerOfTwo(64));
		
	}

}
