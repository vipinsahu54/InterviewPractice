package com.java67;

public class DuplicateCharacters {
	/**
	 * How to print the duplicate characters from the given String?
	 * @param args
	 */
	public static void main(String[] args) {
		String data="Java and JavaScript";
		
		int[] occurrances=new int[26];
		char[] characters=data.toCharArray();
		for(int i=0;i<characters.length;i++) {
			int asci=(int)characters[i];
			int position=asci-97;
			
			if(asci>=97 && asci<=122) {
				occurrances[position]+=1;
			}
		}
		for(int i=0;i<occurrances.length;i++) {
			if(occurrances[i]>1) {
				System.out.println((char)(i+97)+" : "+occurrances[i]);
			}
		}
	}

}
