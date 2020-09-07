package com.data.structure.sorting;

/**
 * Insertion Sort
 * 
 * @author vipin sahu
 *
 */
public class InsertionSort {

	public static void main(String[] args) {
		int[] array= {4,64,3,2,24,78,-12,-55,12};
		insertionSort(array);
		for (int i : array) {
			System.out.print(i+" ");
		}
	}
	
	public static void insertionSort(int[] array) {
		for(int i=0; i<array.length; i++) {
			for(int j=i; j>0; j--) {
				if(array[j] < array[j-1])
					swap(array, j, j-1);
				else continue;
			}
		}
	}
	
	public static void swap(int[] array, int src, int des) {
		if(src==des)
			return;
		int temp=array[src];
		array[src] = array[des];
		array[des] = temp;
	}
}
