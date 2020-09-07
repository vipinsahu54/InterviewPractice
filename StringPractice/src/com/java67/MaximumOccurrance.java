package com.java67;

public class MaximumOccurrance {
	
	/**
	 * How to find the maximum occurring character in given String?
	 * @param args
	 */
	public static void main(String[] args) {
		String data="hello how are you, i hope you are fine";
		
		int[] occurrances=new int[26];
		char[] characters=data.toCharArray();
		
		for (int i=0;i<characters.length;i++) {
			int asci=(int)characters[i];
			int position=asci-97;
			
			if(asci>=97 && asci<=122) {
				occurrances[position] += 1;
			}
		}
		
		int posi=0;
		int times=0;
		for (int i=0;i<occurrances.length;i++) {
			if(occurrances[i]>times) {
				posi=i;
				times=occurrances[i];
			}
		}
		posi+=97;
		System.out.println((char)posi+":"+times);
	}

}
