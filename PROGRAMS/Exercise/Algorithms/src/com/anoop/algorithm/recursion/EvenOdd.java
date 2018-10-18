package com.anoop.algorithm.recursion;

/*
 * A number is even if its predecessor is odd.
 • A number is odd if is not even.
 • The number 0 is even by definition.
 */
public class EvenOdd {

	static boolean isEven(int n){
		if(n == 0){
			return true;
		}
		
		return isOdd(n-1);
	}
	static boolean isOdd(int n){
	 return !isEven(n);	
	}
}
