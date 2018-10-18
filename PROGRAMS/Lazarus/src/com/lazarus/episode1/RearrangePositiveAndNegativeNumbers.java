package com.lazarus.episode1;

import java.util.Arrays;

/*
 * Rearrange the array elements so that positive and negative numbers are placed alternatively.
 */
public class RearrangePositiveAndNegativeNumbers {

	public static void reArrange(int[] a){
		int n = a.length;
		
		//DO Partition similar to quick sort one
		int i=-1;
		for(int j=0;j<n;j++){
			if(a[j] < 0){
				i++;
				swap(a, i , j);
			}
		}System.out.println(Arrays.toString(a));
		
		int positiveStartIndex = i+1, negIndex = 0;
		while(negIndex < positiveStartIndex && positiveStartIndex < n && a[negIndex] < 0){
			swap(a, negIndex, positiveStartIndex);
			positiveStartIndex++;
			negIndex+=2;
		}
	}
	
	public static void swap(int[] a, int i, int j){
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
	public static void main(String[] args){
		int[] a = {-1, 2, -3, 4, 5, 6, -7, 8, 9};
		System.out.println(Arrays.toString(a));
		reArrange(a);
		System.out.println(Arrays.toString(a));
	}
}
