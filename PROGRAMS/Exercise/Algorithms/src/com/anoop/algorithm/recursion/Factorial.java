package com.anoop.algorithm.recursion;

public class Factorial {

	public static int findFactorial(int n){
		
		if(n == 0){
			return 1;
		}else{
			return n*findFactorial(n-1);
		}
	}
}
