package com.anoop.algorithms;

public class ClosestPairWithGivenSumInTwoArray {

	/*
	 * Both array are sorted
	 */
	static void closesPair(int[] a, int[] b, int sum){
		
		int minDiff = Integer.MIN_VALUE;
		int i=0;
		int j=b.length-1;
		int aIndex = -1;
		int bIndex = -1;
		while(i<a.length && j >=0){
			
			if( Math.abs(a[i]+b[j]-sum) < minDiff){
				minDiff = Math.abs(a[i]+b[j]-sum);
				
				aIndex = i;
				bIndex = j;
			}
			
			if(a[i]+b[j] > sum){
				j--;
			}else{
				i++;
			}
		}
	}
	
	static void findClosestPair(int[] a, int[]  b, int sum){
		int minDiff = Integer.MAX_VALUE;
		
		int i = 0;
		int j = b.length-1;
		
		while(i<a.length && j >= 0){
			if( Math.abs(a[i]+b[j]-sum) < minDiff){
				minDiff =  Math.abs(a[i]+b[j]-sum);
			}
			
			if(a[i]+b[j]> sum){
				j--;
			}else{
				i++;
			}
		}
		
		
	}
}
