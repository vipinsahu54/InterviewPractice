package com.data.structure.sorting;

import java.util.Arrays;

public class ShellSort {

	public static void main(String[] args) {
		int[] array= {4,64,3,2,24,78,-12,-55,12};
		shellSort(array);
		Arrays.stream(array).forEach(element -> System.out.print(element+ " "));
	}
	
	public static void shellSort(int[] array) {
		for(int i=array.length/2; i>0; i/=2) {
			for(int j=0; j<i; j++) {
				insertSort(array, j, i);
			}
		}
	}
	
	private static void insertSort(int[] array, int start, int diff) {
		for(int i = start+diff; i<array.length; i+=diff)
			for(int j=i; j>=diff && array[j]<(array[j-diff]); j-=diff)
				swap(array, j, j-diff);
	}
	
	public static void swap(int[] array, int src, int des) {
		int temp=array[src];
		array[src] = array[des];
		array[des] = temp;
	}
}
