package com.algorithm.sorting;

import java.util.Arrays;

public class SelectionSortAlgorithm {

	static void selectionSort(int[] a){
		int len = a.length;
		for(int i=0; i< a.length-1;i++){
			int minIdx = i;
			for(int j = i+1; j<a.length;j++){
				if(a[j] < a[minIdx]){
					minIdx = j;
				}
			}
			
			if(minIdx != i)
			swap(a, minIdx, i);
		}
	}
	static void swap(int[] a , int i, int j){
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	public static void main(String[] args){
		int[] a = {3,1,9,4,6,2};
		System.out.println(Arrays.toString(a));
		SelectionSortAlgorithm.selectionSort(a);
		System.out.println(Arrays.toString(a));
	}
}
