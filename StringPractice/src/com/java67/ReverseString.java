package com.java67;

public class ReverseString {

	/**
	 *  How to reverse a given String? 
	 *  Write a program to reverse a String in C/Java/Python or choice of your programming language. 
	 *  You can write either the recursive or iterative solution.
	 *  For example, if a given input is "abcd," then your function should return "dcba".
	 * @param args
	 */
	public static void main(String[] args) {
		String data="hey there vipin";
		System.out.println(reverseGivenString(data));
	}

	public static String reverseGivenString(String data) {
		String reverse="";
		
		for(int i=data.length()-1;i>=0;i--) {
			reverse +=data.charAt(i);
		}
		return reverse;
		
	}
}
