package com.lazarus.episode1;

import java.util.Arrays;

public class QuickSort {
	
	public static void main(String[] args){
		int[] a = {9, 7, 5, 11, 12, 2, 14, 3, 10, 6};
		System.out.println(Arrays.toString(a));
		new QuickSort().quickSort(a, 0, a.length-1);
		System.out.println(Arrays.toString(a));
	}
	public void quickSort(int[] a, int l, int r){
		if(l < r){
			int q = partition(a, l, r);
			quickSort(a, l, q);
			quickSort(a, q+1, r);
		}
	}

	public int partition(int[] a, int low, int high){
		int pivot = a[low];
		
		int i = low-1;
		int j = high+1;
		
		while(true){
			do{
				i++;
			}while(a[i] < pivot);
			
			do{
				j--;
			}while(a[j] > pivot );
			
			//If i and j crossed
			if(i >= j){
				return j;
			}
			
			//swap the pair
			swap(a,i,j);
		}
	}
	
	private void swap(int[] a,int i,int j){
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
}
