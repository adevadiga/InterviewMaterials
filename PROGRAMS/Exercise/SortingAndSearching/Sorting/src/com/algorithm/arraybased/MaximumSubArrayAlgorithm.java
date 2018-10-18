package com.algorithm.arraybased;

/*
 * Find the maximum sub array sum in array
 */
public class MaximumSubArrayAlgorithm {

	static void maximumSubArray(int[] a){
		
	}
	
	static int maximumSubArray(int[] a, int low, int high)
	{
		if(low == high)//If one element return it
			return a[low];
		
		int mid = (low+high)/2;
		return max(
				maximumSubArray(a, low, mid),
				maximumSubArray(a, mid+1, high),
				maximumCrossingSubArray(a,low,mid,high)
			); 
	}
	static int maximumCrossingSubArray(int[] a, int low, int mid, int high){
		int leftSum = 0, leftMaxSum = 0;
		for(int i=low;i<=mid;i++){
			leftSum += a[i];
			if(leftSum > leftMaxSum)
				leftMaxSum = leftSum;
		}
		int rightSum = 0, rightMaxSum = 0;
		for(int i=mid+1;i<=high;i++){
			rightSum += a[i];
			if(rightSum > rightMaxSum)
				rightMaxSum = rightSum;
		}
		
		return leftMaxSum+rightMaxSum;
	}
	static int max(int a, int b, int c){
		return  a>b && a>c ?a: (b>c?b:c);
	}
}
