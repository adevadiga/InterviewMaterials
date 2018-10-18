package com.cci.questions;

public class TopTwoMaximumInArray {

	public void maxTwo(int[] a){
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		
		for(int n: a){
			if(n > max1){
				max2 = max1;
				max1 = n;
			}else if(n > max2){
				max2 = n;
			}
		}
		
		System.out.println(max1+", "+max2);
	}
}
