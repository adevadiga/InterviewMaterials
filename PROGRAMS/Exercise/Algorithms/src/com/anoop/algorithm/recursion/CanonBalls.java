package com.anoop.algorithm.recursion;

public class CanonBalls {

	public  static void balls(){
		System.out.println(canon(3));
		System.out.println(power(2, 5));
	}
	static int canon(int n){
		if(n <= 1){
			return n;
		}
		
		return ((int)Math.pow(n, 2))+canon(n-1);
		
	}
	static int  power(int k, int n){
		if(n==0){
			return 1;
		}
		
		return k*power(k,n-1);
	}
}
