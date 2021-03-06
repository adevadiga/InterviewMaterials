package com.lazarus.episode1;

import java.util.Arrays;

/*Given an array arr[] of size n where every element is in range from 0 to n-1.
Rearrange the given array so that arr[i] becomes arr[arr[i]]. This should be done with O(1) extra space.

Examples:

Input: arr[]  = {3, 2, 0, 1}
Output: arr[] = {1, 0, 3, 2}

Input: arr[] = {4, 0, 2, 1, 3}
Output: arr[] = {3, 4, 2, 0, 1}

Input: arr[] = {0, 1, 2, 3}
Output: arr[] = {0, 1, 2, 3}
*/
public class RearrangeArray {
	
	public static void reArrnageNoSpace(int[] a){
		/* Increase every array element arr[i] by (arr[arr[i]] % n)*n.
		 2) Divide every element by n.

		 Let us understand the above steps by an example array {3, 2, 0, 1}
		 In first step, every value is incremented by (arr[arr[i]] % n)*n
		 After first step array becomes {7, 2, 12, 9}. 
		 The important thing is, after the increment operation
		 of first step, every element holds both old values and new values. 
		 Old value can be obtained by arr[i]%n and new value can be obtained
		 by arr[i]/n.

		 In second step, all elements are updated to new or output values 
		 by doing arr[i] = arr[i]/n.
		 After second step, array becomes {1, 0, 3, 2*/
	}

	public static void reArrange(int[] a){
		int[] temp = new int[a.length];
		for(int i=0;i<a.length;i++){
			temp[i] = a[i];
		}
		
		for(int i=0;i<temp.length;i++){
			//a[i] becomes a[a[i]]
			a[i] = temp[temp[i]];
		}
		System.out.println(Arrays.toString(a));
	}
	public static void main(String[] args){
		int  arr[]  = {3, 2, 0, 1};
		System.out.println(Arrays.toString(arr));
		reArrange(arr);
	}
}
