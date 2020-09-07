package com.java67;

import java.util.HashMap;
import java.util.Map;

public class RomanNumberConverter {

	Map<String,Integer> grammer=new HashMap<>();
	public RomanNumberConverter(){
		grammer.put("I", 1);
		grammer.put("V", 5);
		grammer.put("X", 10);
		grammer.put("L", 50);
		grammer.put("C", 100);
		grammer.put("D", 500);
		grammer.put("M", 1000);
	}
	
	public static void main(String[] args) {
		String number="MMMDCCCLXXXVIII";
		
		RomanNumberConverter romanNumberConverter=new RomanNumberConverter();
		System.out.println(romanNumberConverter.getNumericValue(number));
	}
	public int getNumericValue(String roman) {
		int number=0;
		for(int i=0;i<roman.length();i++) {
			if(i==roman.length()-1) {
				number+=grammer.get(roman.substring(i, i+1));
				break;
			}
			if(grammer.get(roman.substring(i, i+1))>=grammer.get(roman.substring(i+1, i+2))) {
				number+=grammer.get(roman.substring(i, i+1));
			}
			else {
				number-=grammer.get(roman.substring(i, i+1));
			}
		}
		
		return number;
	}
}
