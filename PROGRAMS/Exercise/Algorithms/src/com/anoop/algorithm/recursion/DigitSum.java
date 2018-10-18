package com.anoop.algorithm.recursion;

public class DigitSum {
	
	public static void findDigitiSum(int n)
	{ 
		//n*=-1;
		System.out.println(digitSumRecur(n));
	}
	
	static int digitSumRecur(int n){
		if(n<10){
			return n;
		}
		return (n%10)+digitSumRecur(n/10);
	}
	
	

}
