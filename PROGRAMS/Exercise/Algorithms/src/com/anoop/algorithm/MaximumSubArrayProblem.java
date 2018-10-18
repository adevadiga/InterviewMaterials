package com.anoop.algorithm;

public class MaximumSubArrayProblem {
 
	public static void find(int[] a){
		
		int max = maximumSubArray(a,0,a.length-1);
		System.out.println("Max sub array sum "+max);
	}
	
	public static int maximumSubArray(int[] a, int low, int high)
	{
		
		if(low==high)
			return a[low];
		
			int mid = (low+high)/2;
			
			return max( maximumSubArray(a, low, mid),
					    maximumSubArray(a, mid+1, high),
						maximumCrossingSubArray(a,low,mid,high)
					);
			
		
			
		
	}
		
    static int maximumCrossingSubArray(int[] a, int low, int mid, int high)
    {
	   int leftMaxSum = 0;
	   int leftSum = 0;
	   for(int i=mid;i>=low;i--){
		   leftSum+=a[i];
		   if(leftSum>leftMaxSum){
			   leftMaxSum = leftSum;
		   }		   
	   }
	   int rightMaxSum=0;
	   int rightSum=0;
	   for(int j=mid+1;j<=high;j++){
		   rightSum+=a[j];
		   if(rightSum>rightMaxSum){
			   rightMaxSum=rightSum;
		   }
	   }
	   
	   return leftMaxSum+rightMaxSum;
		   
	 }
   		
	static int max(int a, int b, int c){
		return  a>b && a>c ?a: (b>c?b:c);
	}
		
	
	
	
}
