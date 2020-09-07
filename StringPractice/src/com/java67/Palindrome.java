package com.java67;

public class Palindrome {
	/**
	 * How to check if a string is palindrome?
	 * @param args
	 */
	public static void main(String[] args) {
		String data="vipiv";
		
		System.out.println(checkPalindrome(data)?"palindrome":"not palindrome");

		
		int num=45454;
		System.out.println(checkReverseInteger(num)?"Reverse":"not Reverse");
	}
	
	/**
	 * method checks whether the string is a palindrome or not
	 * @param data
	 * @return boolean
	 */
	public static boolean checkPalindrome(String data) {
		String reverse="";
		
		for(int i=data.length()-1;i>=0;i--) {
			reverse+=data.charAt(i);
		}
		if(data.equalsIgnoreCase(reverse)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
	 * Method check whether the number is an reverse or not
	 * @param number
	 * @return boolean
	 */
	public static boolean checkReverseInteger(int number) {
		int reverse=0;
		int original=number;
		while(number>0) {
			int rem=number%10;
			reverse =(reverse*10)+rem;
			number /=10;
		}
		
		if(original==reverse) {
			return true;
		}else {
			return false;
		}
		
	}

}
