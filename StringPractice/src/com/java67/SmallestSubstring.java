package com.java67;

import java.util.ArrayList;
import java.util.List;

public class SmallestSubstring {
	/**
	 * How to find the smallest substring in a given string containing all characters of another string?
	 * Write an efficient function in C/C++ or Java to print the smallest 
	 * substring in a given string containing all characters of another String. 
	 * For example, if given String is "this is a test string" and "tist", then the output should be "t stri".
	 * @param args
	 */
	public static void main(String[] args) {
		String data="this is a test string";
		String string="tist";
		//System.out.println(subString(data, string));
		permutation("", "123");
	}
	public static String subString(String data,String string) {
		String smallestSubString="";
		char[] characters=string.toCharArray();
		List<String> subStrings=new ArrayList<String>();
		
		for(int i=0;i<data.length();i++) {
			 
		}
		return null;
	}
	
	public static void permutation(String per,String data) {
		if(data.isEmpty()) {
			System.out.println(per);
		}else {
			for(int i=0;i<data.length();i++) {
				permutation(per+data.charAt(i), data.substring(0,i)+data.substring(i+1));
			}
			
		}
	}
}
