package com.prog.questions.series;

public class CheckWhetherNumberIsFib {

	public static void test(){
		System.out.println(isFibonacci(13));
	}
	/*
	 * A number is Fibonacci if and only if one or both of (5*n2 + 4) or (5*n2 – 4)
	 *  is a perfect square
	 */
	static boolean isFibonacci(int number){
		return isPerfectSquare(5*number*number+4)
				|| isPerfectSquare(5*number*number-4);
		
	}
	
	static boolean isPerfectSquare(int n){
		return (int)Math.sqrt(n)*(int)Math.sqrt(n) == n;
	}
}
