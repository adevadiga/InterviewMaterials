package com.lazarus.episode1;

/*Given an array arr[] of size n and integer k such that k <= n.

Input:  arr[] = {3, 7, 90, 20, 10, 50, 40}, k = 3
Output: Subarray between indexes 3 and 5
The subarray {20, 10, 50} has the least average 
among all subarrays of size 3.

Input:  arr[] = {3, 7, 5, 20, -10, 0, 12}, k = 2
Output: Subarray between [4, 5] has minimum average*/

public class SubarrayWithLeastAverage {

	public static void leastAverage(int[] a, int k){
		int resultIndex = 0;
		int n=a.length;
		//Find sum of first k element
		int curr_sum = 0;		
		for(int i=0;i<k;i++){
			curr_sum += a[i];
		}
		int minSum = curr_sum;
		//Sliding window logic
		for(int i=k;i<n;i++){
			curr_sum = curr_sum + a[i] - a[i-k];//Add next element and subtract first elem for each
			
			if(curr_sum < minSum){
				minSum = curr_sum;
				resultIndex = i-k+1;
			}
		}
		
		System.out.println("min Index: "+resultIndex);
		
	}
	
	
	public static void main(String[] args) {
		int arr[] = {3, 7, 90, 20, 10, 50, 40}, k = 3;
		leastAverage(arr, k);
		int arr2[] = {3, 7, 5, 20, -10, 0, 12};
		k = 2;
		leastAverage(arr2, k);



	}

}
