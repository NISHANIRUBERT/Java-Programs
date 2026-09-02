package com.nishani.numberAndMathPrograms;

public class PrimeCheck {
	
	public static boolean isPrime(int num) {
		
		if(num<2) return false;
		
		for(int i = 2; (long) i*i <= num; i++) {
			if(num%i == 0) return false;
		}
		
		return true;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("29 is prime: " + isPrime(29));
		
	}

}
