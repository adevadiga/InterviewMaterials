package com.anoop.algorithm.recursion;
/*
 * If x is evenly divisible by y, then y is the greatest common divisor.
 * therwise, the greatest common divisor of x and y is always equal to the greatest
   common divisor of y and the remainder of x divided by y.
 */

public class Gcd {
	
	public static void find(){
		System.out.println(findGcd(7,13));
	}

	public static int findGcd(int x, int y){
		if(x%y == 0){
			return y;
		}
		
		return findGcd(y, x%y);
		
	}
}
