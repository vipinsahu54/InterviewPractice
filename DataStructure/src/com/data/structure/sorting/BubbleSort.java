package com.data.structure.sorting;

/**
 * Bubble Sort
 * 
 * @author vipin sahu
 *
 */
public class BubbleSort {

	public static void main(String[] args) {
		int[] array= {4,64,3,2,24,78,-12,-55,12};
		bubbleSort(array);
		for (int i : array) {
			System.out.print(i+" ");
		}
	}

	public static void bubbleSort(int[] array) {
		for(int sortedIndex=array.length; sortedIndex>0; sortedIndex--) {
			for(int i=0; i<sortedIndex-1; i++) {
				if(array[i] > array[i+1])
					swap(array, i, i+1);
			}
		}
	}
	
	public static void swap(int[] array, int src, int des) {
		int temp=array[src];
		array[src] = array[des];
		array[des] = temp;
	}
}
