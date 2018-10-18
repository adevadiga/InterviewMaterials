package com.lazarus.episode1.intuit;

import java.util.Arrays;

public class PairWithGivenSumInArray {

	static void findPair(int[] a, int x){
		Arrays.sort(a);
		
		for(int i=0,j=a.length-1; i<j;){
			int sum = a[i]+a[j];
			if(sum == x){
				System.out.println(a[i]+","+a[j]);
				break;
			}
			if(sum < x)
				i++;
			else 
				j--;
		}
	}
	public static void main(String[] args) {
		int[] a ={1,4,6,12,5,6,8,9,15};
		findPair(a, 14);
	}

}
