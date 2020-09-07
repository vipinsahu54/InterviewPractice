package com.data.structure.sorting;

import java.util.Arrays;

public class RadixSort {

	public static void main(String[] args) {
		int[] array= {4,64,3,2,24,78,32,55,12};
		radixSort(array);
		Arrays.stream(array).forEach(element -> System.out.print(element+ " "));
	}
	
	public static void radixSort(int[] array) {
		int max=Arrays.stream(array).max().getAsInt();
		
		for(int i=1; i<max; i*=10)
			sort(array, i);
	}
	
	public static void sort(int[] array, int pos) {
		int[] numCount= new int[10];
		int[] temp=new int[array.length];
		
		for(int i=0; i<array.length; i++)
			++numCount[(array[i]/pos)%10];
		for(int i=1; i<numCount.length; i++)
			numCount[i]+=numCount[i-1];
		for(int i=array.length-1; i>=0; i--)
			temp[--numCount[(array[i]/pos)%10]] = array[i];
		for(int i=0; i<array.length; i++)
			array[i]=temp[i];
	}
}
