package com.data.structure.sorting;

import java.util.Arrays;

/**
 * Merge Sort
 * 
 * @author vipin sahu
 *
 */
public class MergeSort {

	public static void main(String[] args) {
		int[] array= {4,64,3,2,24,78,-12,-55,12};
		mergeSort(array, 0, array.length);
		Arrays.stream(array).forEach(element -> System.out.print(element +" "));
	}
	
	public static void mergeSort(int[] array, int start, int end) {
		if(end - start < 2)
			return;
		
		int mid=(start+end)/2;
		mergeSort(array, start, mid);
		mergeSort(array, mid, end);
		merge(array, start, mid, end);
	}
	
	public static void merge(int[] array, int start, int mid, int end) {
		if(array[mid-1] <= array[mid])
			return;
		
		int tempIndex=0;
		int i=start;
		int j= mid;
		int[] temp=new int[end-start];
		
		while(i<mid && j<end) {
			temp[tempIndex++]=array[i] < array[j] ? array[i++]:array[j++];
		}
		System.arraycopy(array, i, array, start+tempIndex, mid-i);
		System.arraycopy(temp, 0, array, start, tempIndex);
	}
}
