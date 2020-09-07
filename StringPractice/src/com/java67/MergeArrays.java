package com.java67;

import java.util.Arrays;

public class MergeArrays {

	public static void main(String[] args) {
		int[] arr1= {0,1,2,3,5,7,9};
		int[] arr2= {-2,-1,2,4,6,8};
		int count=0;
		int[] mergeArr=new int[arr1.length+arr2.length];
		
		for (int i : arr1) {
			mergeArr[count]=i;
			count++;
		}
		
		for (int i : arr2) {
			mergeArr[count]=i;
			count++;
		}
		
		Arrays.sort(mergeArr);
		
		for (int i : mergeArr) {
			System.out.println(i);
		}
	}

}
