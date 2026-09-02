package com.nishani.numberAndMathPrograms;

public class LCM {
	
	public static int gcd(int num1, int num2) {
		
		return (num2==0)?num1:gcd(num2, num1%num2);
		
	}
	
	public static int lcm(int num1, int num2) {
		
		return num1/gcd(num1,num2)*num2;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("LCM: " + lcm(4, 6));
		
	}

}
