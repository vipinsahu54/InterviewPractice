package com.data.structure.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BucketSort {

	public static void main(String[] args) {
		int[] input= {35,64,87,4,34,88,52,8,75,54};
		bucketSort(input);
		Arrays.stream(input).forEach(System.out::println);
	}

	@SuppressWarnings("unchecked")
	public static void bucketSort(int[] array) {
		List<Integer>[] buckets=new ArrayList[10];
		for(int i=0; i<buckets.length; i++)
			buckets[i]=new ArrayList<>();
		for (Integer input : array) {
			int hash=hash(input);
			buckets[hash].add(input);
		}
		for (List<Integer> list : buckets) {
			Collections.sort(list);
		}
		int j=0;
		for(int i=0; i<buckets.length; i++) {
			for(int k=0; k<buckets[i].size(); k++)
				array[j++]=buckets[i].get(k);
		}
	}
	
	public static int hash(int value) {
		return value/10;
	}
}
