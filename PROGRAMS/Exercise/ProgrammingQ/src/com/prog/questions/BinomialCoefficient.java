package com.prog.questions;

public class BinomialCoefficient {
	
	static void test(){
		System.out.println(ncr(6,4));
		binomailC(6, 2);
	}
	
	static int ncr(int n, int r){
		return fact(n)/(fact(n-r) * fact(r));
	}
	
	static int fact(int n){
		if(n == 0 || n==1){
			return 1;
		}
		return n*fact(n-1);
	}
	
	/*
	 * C(n, k) = [n * (n-1) * .... * (n-k+1)] / [k * (k-1) * .... * 1]

	 */
	static void binomailC(int n, int k){
		if(n-k < k){
			k = n-k;
		}
		int result = 1;
		for(int i=0;i<k;i++){
			result *= n-i;
			result /= k-i;
		}
		
		System.out.println(result);
		
	}

}
