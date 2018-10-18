package com.lazarus.episode1;

public class FindMaximumPositiveDifferenceBetweenArray {

	public static void main(String[] args){
		int[] a = {10, 15, 90, 200, 110};
		findMaxPosDiffBetweenTwoElem(a);
	}
	public static void findMaxPosDiffBetweenTwoElem(int[] a){
		
		int maximum = 0;
		int maxDiff = 0;;
		for(int i=0;i<a.length-1;i++){
			maximum = max(maximum, a[i]);
			
			maxDiff = max(maxDiff,  maximum-a[i]);
		}
		
		System.out.println(maxDiff);
	}
	
	public static int max(int a, int b){
		return a>b?a:b;
	}
}
