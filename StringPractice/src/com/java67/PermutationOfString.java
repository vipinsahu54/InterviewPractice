package com.java67;

import java.util.Scanner;

public class PermutationOfString {
	
	/**How to print all permutation of a String?
	 * 
	 * Write an efficient program to print all permutations of a given String in Java/C/Python
	 * or any programming language of your choice.
	 * For example, if given input is "123" then your program should print all 6 permutations 
	 * e.g. "123", "132", "213", "231", "312" and "321".
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		//String data="1254";
		
		char[] characters=input.toCharArray();
		
		for(int i=0;i<characters.length;i++) {
			String word=""+characters[i];
			for(int j=0;j<characters.length;j++) {
				if(i==j)
					continue;
				word += characters[j];
			}
			System.out.println(word);
		}
		
		sc.close();
		
	}

}
