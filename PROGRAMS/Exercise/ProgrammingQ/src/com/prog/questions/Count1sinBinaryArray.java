package com.prog.questions;

public class Count1sinBinaryArray {
	
	/*
	 * Array is in non-increasing order
	 * Method 1: Sum array and lengthOfArrray - sum
	 * Method 2: Use binary search - log(n)
	 */
	
	static int count1s(int[] a, int low, int high){
		
		if(low > high){
			return 0;
		}
			
			int mid = low + (high-low)/2;
			
			/*
			 * Non increasing order -  1 must be left of middle or middle
			 */
			if( ( mid == high || a[mid+1] == 0 ) && a[mid] == 1){
				return mid+1;
			}
			
			//Note: Non increasing order - 
			if(a[mid] == 1){
				return count1s(a, mid+1, high);
			}
			
			return count1s(a, low, mid-1);			
		}
	

}
