package com.nishani.numberAndMathPrograms;

public class GCD {
	
	public static int gcd(int num1, int num2) {
		
		int temp;
		
		while(num2 != 0) {
			
			temp = num2;
			num2 = num1%num2;
			num1 = temp;
			
		}
		
		return num1;
		
		//return(num2 == 0)?num1:gcd(num2,num1%num2);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("GCD: " + gcd(48, 36));
		
	}

}
