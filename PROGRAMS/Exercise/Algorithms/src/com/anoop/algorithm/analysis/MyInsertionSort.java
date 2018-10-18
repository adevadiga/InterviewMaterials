package com.anoop.algorithm.analysis;

import java.util.Arrays;

public class MyInsertionSort {

	public static void doSort(int[] a){
		System.out.println(Arrays.toString(a));
		new MyInsertionSort().sort(a);
		System.out.println(Arrays.toString(a));
		
	}
	void sort(int[] a){
		
		for(int i=1; i<a.length;i++){
			
			int j=i-1;
			int key = a[i];
			
			while(j>=0 && key < a[j] ){
				a[j+1] = a[j];
				j--;
				
			}
			
			a[j+1]=key;
			
			/*if(i!=j){
				swap(j, i, a);
			}*/
		   
		}
	}
	
	void swap(int i, int j , int[] a){
		int t = a[i];
		a[i] = a[j];
		a[j]=t;
	}
}
