package com.lazarus.episode1;

/*Given an array arr[] of size n. Three elements arr[i], arr[j] and arr[k] form an inversion of size 3
if a[i] > a[j] >a[k] and i < j < k. Find total number of inversions of size 3.

Example:

Input:  {8, 4, 2, 1}
Output: 4
The four inversions are (8,4,2), (8,4,1), (4,2,1) and (8,2,1).

Input:  {9, 6, 4, 5, 8}
Output:  2
The two inversions are {9, 6, 4} and {9, 6, 5}*/

public class InversionOfSize3 {
	
	public static void find2(int[] a){
		int count = 0;
		int n=a.length;
		for(int i=1; i< n-1;i++){
			int small = 0;
			for(int j=i+1;j<n;j++){
				if(a[j] <a[i]){
					small++;
				}
			}
			
			int greater = 0;
			for(int j=i-1;j>=0;j--){
				if(a[j] > a[i]){
					greater++;
				}
			}
			
			count += small*greater;
		}
		System.out.println(count);
	}

	/*
	 * O(n3)
	 */
	public static void find(int[] a){
		int len = a.length;
		int count = 0;
		for(int i=0;i<len-2;i++){
			for(int j=i+1;j<len-1;j++){
				if(a[j] > a[i]){
					continue;//j is not less so go to next number
				}
				for(int k=j+1;k<len;k++){
					if(a[k] > a[j]){
						continue;						
					}
					count++;
				}
				
			}
			
		}
		System.out.println(count);
	}
	
	public static void main(String[] args){
		int[] a = {8, 4, 2, 1};
		find2(a);
		int[] b= {9, 6, 4, 5, 8};
		find2(b);
	}
}
