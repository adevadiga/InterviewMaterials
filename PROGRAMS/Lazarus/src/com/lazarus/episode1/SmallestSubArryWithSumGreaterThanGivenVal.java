package com.lazarus.episode1;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class SmallestSubArryWithSumGreaterThanGivenVal {

	public int find(int[] a, int x){
		int minLen = a.length +1;
		
		
		for(int start = 0; start < a.length;start++){
			int sum = a[start];
			
			if(sum > x) return 1; //length of sub array has one element
			
			for(int end = start+1; end<a.length;end++){
				sum += a[end];
				
				if(sum > x && (end-start+1) < minLen){
					minLen = end-start+1;
				}
			}
		}
		return minLen;		
	}
	
	public static int smallestSum(int[] a, int x){
		int cur_sum = 0, minLen = a.length+1;
		
		int start = 0, end= 0;
		
		while(end <a.length){
			
			while(cur_sum <= x && end <a.length){
				cur_sum += a[end++];
			}
			
			while(cur_sum > x && start <a.length){
				if(end-start <minLen){
					minLen  = end-start;
				}
				
				cur_sum -= a[start++];
				
			}
		}
		
		return minLen;
	}
}
