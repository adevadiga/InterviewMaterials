package com.lazarus.episode1;

public class LongestSpanSumInTwoBinaryArrays {

	public static void longestSumSequence(int[] a, int[] b){
		int maxLen = 0;
		
		for(int i=0;i<a.length;i++){
			int sum1 = 0, sum2 = 0;
			for(int j=i;j<a.length;j++){
				sum1 += a[j];
				sum2 += b[j];
				
				if(sum1 == sum2){
					if( (j-i+1) > maxLen){
						maxLen = j-i+1;
					}
				}
			}
			
		}
		System.out.println(maxLen);
		
	}
	
	public static void main(String[] args) {
      int arr1[] = {0, 1, 0, 0, 0, 0};
   int  arr2[] = {1, 0, 1, 0, 0, 1};
   longestSumSequence(arr1, arr2);
//Output: 4
//The longest span with same sum is from index 1 to 4.

int arr3[] = {0, 1, 0, 1, 1, 1, 1};
   int arr4[] = {1, 1, 1, 1, 1, 0, 1};
   longestSumSequence(arr3, arr4);
//Output: 6
//The longest span with same sum is from index 1 to 6.


	}

}
