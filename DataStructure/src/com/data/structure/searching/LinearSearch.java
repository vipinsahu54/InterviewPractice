package com.data.structure.searching;

public class LinearSearch {

	public static void main(String[] args) {
		int[] array= {3,55,7,23,30,61,8,6,644,5,6,8,9,57,54,3,2334,55};

		System.out.println(search(array,55));
		System.out.println(search(array,8474));
		System.out.println(search(array,644));
	}
	
	public static int search(int[] array, int item) {
		for (int element : array) {
			if(item==element)
				return element;
		}
		return -1;
	}

}
