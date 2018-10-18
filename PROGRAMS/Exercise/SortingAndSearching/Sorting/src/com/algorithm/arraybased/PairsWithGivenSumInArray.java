package com.algorithm.arraybased;

import java.util.Arrays;

public class PairsWithGivenSumInArray {
	
	static void pairsWithGivenSum(int[] a, int sum){
		Arrays.sort(a);
		int len = a.length;
		for(int i=0,j=len-1;i<j;){
			int s = a[i]+a[j];
			if( s == sum){
				System.out.println(a[i]+","+a[j]);
				break;
			}
			if(s < sum){
				i++;
			}else{
				j--;
			}
		}
	}

	public static void main(String[] args) {
		int[] a ={1,4,6,12,5,6,8,9,15};
		pairsWithGivenSum(a, 14);

	}

}
