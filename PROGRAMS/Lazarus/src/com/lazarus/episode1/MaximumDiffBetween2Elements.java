package com.lazarus.episode1;


/*
 * Maximum difference between two elements such that larger element appears after the smaller number
Given an array arr[] of integers, find out the difference between any two elements such that larger element appears
 after the smaller number in arr[].

Examples: If array is [2, 3, 10, 6, 4, 8, 1] then returned value should be 8 (Diff between 10 and 2). 
If array is [ 7, 9, 5, 6, 3, 2 ] then returned value should be 2 (Diff between 7 and 9)


 */
public class MaximumDiffBetween2Elements {

	 
	/* The function assumes that there are at least two
	   elements in array.
	   The function returns a negative value if the array is
	   sorted in decreasing order.
	   Returns 0 if elements are equal  */
	
	static int maxDiff(int[] a){
		int n = a.length;
		int maxDiff = a[1]-a[0];
		int minElem = a[0];
		for(int i=1;i<n;i++){
			if(a[i]-minElem > maxDiff){
				maxDiff = a[i]-minElem;
			}
			
			if(a[i] < minElem){
				minElem = a[i];
			}
		}
		
		return maxDiff;
	}
	
	public static void main(String[] args){
		int[] a = {2, 3, 10, 6, 4, 8, 1};
		System.out.println(maxDiff(a));
	}
}
