package com.lazarus.episode1;

import java.util.Arrays;

public class RearrangeArrayInMaximumAndMinimunForm {

	/*
	 * Given a sorted array of positive integers, rearrange the array alternately 
	 * i.e first element should be maximum value, second minimum value, third second max, fourth second min and so on.
		Examples:		
		Input  : arr[] = {1, 2, 3, 4, 5, 6, 7} 
		Output : arr[] = {7, 1, 6, 2, 5, 3, 4}
		
		Input  : arr[] = {1, 2, 3, 4, 5, 6} 
		Output : arr[] = {6, 1, 5, 2, 4, 3}

	 */
	public static void rearrangeArray(int[] a){
		System.out.println(Arrays.toString(a));
		int[] newArray = new int[a.length];
		int k=0;
		for(int i=0,j=a.length-1;i <=j;i++,j--){
			newArray[k++] = a[j];
			if(i != j)
			newArray[k++] = a[i];
		}
		System.out.println(Arrays.toString(newArray));
	}
	
	public static void main(String[] args){
		int[] a = {1, 2, 3, 4, 5, 6, 7} ;
		rearrangeArray(a);
	}
}
