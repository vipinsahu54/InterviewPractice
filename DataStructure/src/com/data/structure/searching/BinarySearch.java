package com.data.structure.searching;

import java.util.Arrays;
import java.util.stream.Collectors;

import com.data.structure.sorting.BubbleSort;

public class BinarySearch {

	public static void main(String[] args) {
		int[] array= {3,55,7,23,30,61,644,5,6,8,9,57,54,2334};
		BubbleSort.bubbleSort(array);
		print(array);
		System.out.println(search(array,55));
		System.out.println(search(array,8474));
		System.out.println(search(array,644));
		System.out.println(search(array,8548));
		System.out.println(search(array,659));
		System.out.println(search(array,7));
	}
	
	public static int search(int[] array, int value) {
		return search(array, value, 0, array.length);
	}
	
	private static int search(int[] array, int value, int start, int end) {
		if(start>end || start>array.length-1)
			return -1;
		int mid=(start+end)/2;
		if(array[mid]==value)
			return array[mid];
		else if(value<array[mid])
			return search(array, value,start,mid-1);
		else
			return search(array, value, mid+1, end);
	}

	public static void print(int[] array) {
		String str= Arrays.stream(array).mapToObj(String::valueOf).collect(Collectors.joining(", "));
		System.out.println("["+str+"]");
	}
}
