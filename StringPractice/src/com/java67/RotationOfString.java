package com.java67;

public class RotationOfString {

	/**
	 * How to check if two strings are rotations of each other?
	 *  A string is made of characters and you just rotate the String around any character 
	 *  e.g. "programming" will become "ingprogramm"
	 *  The string can also be rotated in one go e.g. "123456" will become "456123" 
	 *  if we rotate 456 to the left around character "3".
	 *  
	 *  Problem:
	 *  Write a program to check if two given String s1 and s2 are rotations of another. 
	 *  For example if s1 = "IndiaUSAEngland" and s2= "USAEnglandIndia" then your program should
	 *  return true but if s2="IndiaEnglandUSA" then it should return false.
	 * @param args
	 */
	public static void main(String[] args) {
		String s1="IndiaUSAEngland";
		String s2="USAEnglandIndia";
		String rotate=s1;
		while(true) {
			rotate=makeRightShift(rotate);
			if(rotate.equals(s1)) {
				System.out.println("String is not reverse");
				break;
			}
			
			if(rotate.equals(s2)) {
				System.out.println("String is reverse of second string");
				break;
			}
			
		}
	}
	
	/**
	 * makes a right shift in a string
	 * @param data
	 * @return
	 */
	public static String makeRightShift(String data) {
		char[] characters=data.toCharArray();
		char firstChar=characters[0];
		for(int i=0;i<characters.length;i++) {
			if(i==characters.length-1) {
				characters[i]=firstChar;
				break;
			}
			characters[i]=characters[i+1];
		}
		return new String(characters);
		
	}

}
