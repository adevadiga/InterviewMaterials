package com.algorithm.sorting;

import java.util.Arrays;

public class InsertionSortAlgorithm {

	static void insertionSort(int[] a){		
		int len =a.length;
		int i=0;
		for(int j = 1; j < len;j++){
			i = j-1;
			int key = a[j];
			while(i >= 0 && key < a[i]){
				a[i+1] = a[i];
				i--;
			}
			a[i+1] = key;
		}
	}
	public static void main(String[] args){
		int[] a = {3,1,9,4,6,2};
		System.out.println(Arrays.toString(a));
		InsertionSortAlgorithm.insertionSort(a);
		System.out.println(Arrays.toString(a));
	}
}
