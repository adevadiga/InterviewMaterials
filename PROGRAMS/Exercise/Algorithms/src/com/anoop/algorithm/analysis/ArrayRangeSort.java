package com.anoop.algorithm.analysis;

import java.util.Arrays;

public class ArrayRangeSort {

	public static void doSort(){
		
		int[] input = {4,1,6,9,7,7,94,45};
		System.out.println(Arrays.toString(input));
		int[] counts = new int[1000];
		for(int i =0;i<counts.length;i++){
			counts[i]=0;
		}
		
		for(int i=0;i<input.length;i++){
			counts[input[i]]++;
		}
		int j=0;
		for(int i =0;i<counts.length;i++){
			if(counts[i] != 0 ){
				int t = counts[i];
				while(t > 0){
					input[j++] = i;
					t--;
				}
			}
		}
		
		
		System.out.println(Arrays.toString(input));
	}
}
