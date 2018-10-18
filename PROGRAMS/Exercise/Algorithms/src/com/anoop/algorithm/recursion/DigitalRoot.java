package com.anoop.algorithm.recursion;

public class DigitalRoot {
	
	public static void f(){
		System.out.println(digitSumRecur(1729));
	}
	/*
	 * 1729
	 * 1+7+2+9=19
	 * 1+9=10
	 * 1+0=1
	 */
	public static int digitSumRecur(int n){
		if(n<10){
			return n;
		}
		int sum= (n%10)+digitSumRecur(n/10);
		return digitSumRecur(sum);
	}
	/*************/
	public static int dRoot(int n){
		int sum = digitalSum(n);
		if(sum  < 0){
			return sum;
		}else{
			return dRoot(sum);
		}
		
	}
	
	public static  int digitalSum(int n){
		if(n<10){
			return n;
		}
		return (n%10)+digitSumRecur(n/10);
	}

}
