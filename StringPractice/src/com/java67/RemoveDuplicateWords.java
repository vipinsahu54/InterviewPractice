package com.java67;

public class RemoveDuplicateWords {
	/**
	 * How to remove all duplicates from a given string?
	 * @param args
	 */
	public static void main(String[] args) {
		String data="here we are and here we go";
		
		String[] words=data.split(" ");
		String output="";
		
		for(int i=0;i<words.length;i++) {
			if(!output.contains(words[i])) {
				output+=(words[i]+" ");
				
			}
		}
		System.out.println(output);
	}

}
