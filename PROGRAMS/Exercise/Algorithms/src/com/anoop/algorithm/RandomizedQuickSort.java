package com.anoop.algorithm;

import java.util.Arrays;
import java.util.Random;

public class RandomizedQuickSort {
	public static void sort(int[] a){
		System.out.println("Input");
		System.out.println(Arrays.toString(a));
		new RandomizedQuickSort().randomizedQuickSort(a, 0, a.length-1);
		System.out.println("Output");
		System.out.println(Arrays.toString(a));
	}
	
	void randomizedQuickSort(int[] a , int p, int r){
		if(p < r){
              int q =  randomizedPartition(a, p ,r);
              randomizedQuickSort(a, p, q-1);
              randomizedQuickSort(a, q+1, r);
		}
	}
	
	int randomizedPartition(int[] a, int p, int r){
		
		// randomPivotIndex = (int)(Math.random()*(r-p));
		//
		
		Random rand = new Random();
		int randomPivotIndex = (int)rand.nextInt( (r-p)+1)+p;
		swap(randomPivotIndex, r, a);
		
		return partition(a, p, r);
		
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
