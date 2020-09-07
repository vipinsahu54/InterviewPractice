package com.java67;

public class RemoveCharacters {
	
	/**
	 * How to remove characters from the first String which are present in the second String?
	 */
	public static void main(String[] args) {
		String firstString="India is great";
		String secondString="in";
		
		char[] firstWords=firstString.toLowerCase().toCharArray();
		char[] secondWords=secondString.toLowerCase().toCharArray();
		
		String output="";
		
		for (int i=0;i<firstWords.length;i++) {
			
		}
		for (char first : firstWords) {
			boolean state=true;
			for (char second : secondWords) {
				if(first==second) {
					state=false;
				}
			}
			if(state)
			output+=first;
		}
		System.out.println(output);
	}
}
