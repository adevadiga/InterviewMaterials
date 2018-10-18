package com.lazarus.episode1;

import java.util.Arrays;

/*We are given two sorted array. We need to merge these two arrays such that the initial numbers (after complete sorting)
 *  are in the first array and the remaining numbers are in the second array. Extra space allowed in O(1).

Example:

Input: ar1[] = {1, 5, 9, 10, 15, 20};
       ar2[] = {2, 3, 8, 13};
Output: ar1[] = {1, 2, 3, 5, 8, 9}
        ar2[] = {10, 13, 15, 20}  */

public class MergeTwoSortedArrays {

	public static void merge(int[] a, int[] b){
		int aLen = a.length;
		int bLen = b.length;
		
		for(int j = bLen-1; j>=0 ; j--){
			
			int lastOfA = a[aLen-1];
			int i = aLen-1 ;
			for(; a[i] > b [j] && i>=0;i--){
				a[i] = a[i-1]; 
			}
			
			if(i != aLen-1  ){
				a[i+1] = b[j];
				b[j] = lastOfA;
			}
			
		}
		/*for(int i=0,j=0; i<aLen && j < bLen;){
			if(a[i] > b[j]){
				swap(a,b,i,j);
				int t = b[j];
				
				int k = j+1;
				while(k<bLen && t < b[k]){
				  swap(b,b,k,j);	
				}
				i++;
			}else{
				i++;
			}
			
		}*/
		
	}
	
	public static void swap(int[] a, int[] b, int i, int j){
		int temp = a[i];
		a[i] = b[j];
		b[j] = temp;
	}
	
	public static void main(String[] args){
		int[] a = {1, 5, 9, 10, 15, 20};
		int[] b = {2, 3, 8, 13};
		merge(a,b);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}
}
