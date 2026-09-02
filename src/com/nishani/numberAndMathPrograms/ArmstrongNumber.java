package com.nishani.numberAndMathPrograms;

public class ArmstrongNumber {
	
	public static boolean isArmstrong(int num) {
		
		int digits = String.valueOf(num).length();
		int sum = 0, temp = num;
		
		while(temp > 0) {
			int n = temp%10;
			sum += (int)Math.pow(n,digits);
			temp = temp/10;
		}
		
		if(sum == num) {
			return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		
		System.out.println("153 is Armstrong: " + isArmstrong(153));
		
	}

}
