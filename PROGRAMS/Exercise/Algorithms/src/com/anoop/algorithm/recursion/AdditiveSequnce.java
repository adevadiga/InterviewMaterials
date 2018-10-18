package com.anoop.algorithm.recursion;

public class AdditiveSequnce {

	public static void find(int n){
		System.out.println(additSequnce(n, 0, 1));
	}
	
	/*
	 * 5th term in fibonacci number si 4th term if the start is one step ahead
	 * 0 1 1 2 3
	 * 
	 * 5th term (i.e 3) is same as 4th term if the starting term is on ahead,i.e
	 * if starting is 1 & 1 (instead of 0 & 1)
	 * 
	 * i.e t0, t1  ===> t1, t0+t1
	 * 
	 */
	static int additSequnce(int n, int t0, int t1){
		if(n==0){
			return t0;
		}
		
		if(n == 1){
			return t1;
		}
		
		return additSequnce(n-1, t1, t0+t1);
	}
}
