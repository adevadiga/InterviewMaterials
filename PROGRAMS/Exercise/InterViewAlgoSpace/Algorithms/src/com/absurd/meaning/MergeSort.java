package com.absurd.meaning;

public class MergeSort {

	public static void mergeSort(int[] a){
		
	}
	
	public int[] mergeSort(int[] a, int low, int high){
		if(high - low < 1){
			return a;
		}
		int mid = (low+high)/2;
		mergeSort(a,low,mid);
		mergeSort(a,mid+1,high);
		return merge();
	}
}
