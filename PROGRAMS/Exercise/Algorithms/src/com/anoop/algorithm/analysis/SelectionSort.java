package com.anoop.algorithm.analysis;

import java.util.Arrays;

public class SelectionSort {

	public static void doSort(int[] a){
		System.out.println(Arrays.toString(a));
		sort(a);
		System.out.println(Arrays.toString(a));
	}
	static void sort(int[] a){
		
		for(int i=0;i<a.length-1;i++){
			int low = i;
			for(int j=i+1;j<a.length;j++){
				if(a[j] < a[low]){
					low = j;
				}
			}
			
			swap(i,low,a);
		}
	}
	static void swap(int i, int j, int[] a){
		int t=a[i];
		a[i] = a[j];
		a[j] = t;
	}
}
