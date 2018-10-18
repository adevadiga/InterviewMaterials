package com.lazarus.episode1;

import java.util.Arrays;


/*Move all zeroes to end of array
Given an array of random numbers, Push all the zero’s of a given array to the end of the array. For example, if the given arrays is {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0},
it should be changed to {1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0}. The order of all other elements should be same.
Expected time complexity is O(n) and extra space is O(1)
*/
public class MoveAllZeroesToEndOfArray {

	
	public static void moveZeroes(int[] a){
		int count = 0; //Maintain count of non zero
		
		for(int i=0;i<a.length;i++){
			if(a[i] != 0){
			  a[count++] = a[i];	
			}
		}
		
		while(count < a.length){
			a[count++] = 0;
		}
	}
	/*
	 * Mine is fucking algo
	 */
	public static void moveZeroesTOEnd(int[] a){
		int n = a.length;
		for(int i=0;i<n-1;i++){
			if(a[i] == 0){
				//Find next non zero and replace with i
				int k=i+1;
				while(k < n && a[k] == 0){
					k++;
				}
				if(k > n-1){
					break;
				}
				if(k != (i+1)){
					swap(a, k, i);
				}
			}
		}
		
		
	}
	
	public static void swap(int[] a, int i, int j){
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
	public static void main(String[] args){
		int[] a = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};
		System.out.println(Arrays.toString(a));
		moveZeroesTOEnd(a);
		System.out.println(Arrays.toString(a));
	}
}
