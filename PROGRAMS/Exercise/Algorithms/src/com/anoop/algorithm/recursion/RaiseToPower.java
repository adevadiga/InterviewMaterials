package com.anoop.algorithm.recursion;

public class RaiseToPower {
	
	public static void raisePower(){
		System.out.println(new RaiseToPower().power(3,6));
	}

	/*
	 * x^2n = x^n * x^n
	 */
	int power(int n, int k){
		System.out.println(k);
		if(k == 0){
			return 1;
		}
		if(k == 1){
			return n;
		}
		
		int l = k/2;int r=k-(k/2);
		
		return power(n, l)*power(n, r);
	}
}
