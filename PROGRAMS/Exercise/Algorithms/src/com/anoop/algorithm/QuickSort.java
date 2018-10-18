package com.anoop.algorithm;

import java.util.Arrays;

public class QuickSort {

	public static void sort(int[] a){
		System.out.println("Input");
		System.out.println(Arrays.toString(a));
		new QuickSort().quickSort(a, 0, a.length-1);
		System.out.println("Output");
		System.out.println(Arrays.toString(a));
	}
	/*
	 * 0 to n-1
	 */
    private void quickSort(int[] a, int p, int r){
    	if(p < r){
    		int q = this.partition(a, p, r);
    		this.quickSort(a, p, q-1);
    		this.quickSort(a, q+1, r);
    		
    	}
    }
    private int partition(int[] a, int p, int r){
    	int pivot = a[r];
    	int i = p-1;
    	int j = p;
    	
    	while(j <= r-1){    		
    		if(a[j] <= pivot){
    		    i++;	
    		    this.swap(i, j, a);
    		}
    		
    		
    		j++;
    	}
    	
    	//Place pivot to its exact index. r is pivot index
    	int q=i+1;
    	this.swap(q, r, a);
    	return q;
    	
    }
    private void swap(int i, int j, int[] a){
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
		
	}
}
