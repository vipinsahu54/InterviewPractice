package com.data.structure.sorting;

/**
 * Selection Sort
 * @author vipin sahu
 *
 */
public class SelectionSort {

	public static void main(String[] args) {
		int[] array= {4,64,3,2,24,78,-12,-55,12};
		selectionSort(array);
		for (int i : array) {
			System.out.print(i+" ");
		}
	}
	
	public static void selectionSort(int[] array) {
		int greatestIndex=0;
		for(int sortedList= array.length-1; sortedList>=0; sortedList--) {
			for(int i=0; i<=sortedList; i++) {
				if(array[i] > array[greatestIndex])
					greatestIndex=i;
			}
			swap(array, greatestIndex, sortedList);
			greatestIndex=0;
		}
	}
	
	public static void swap(int[] array, int src, int des) {
		int temp=array[src];
		array[src] = array[des];
		array[des] = temp;
	}
}
