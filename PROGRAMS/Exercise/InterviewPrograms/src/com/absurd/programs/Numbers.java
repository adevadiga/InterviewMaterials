package com.absurd.programs;

public class Numbers {

	public boolean isPowerOfTwo(int n){
		int num = n;
		int rem;
		boolean isPowerOfTwo = true;
		while(num != 0){
			rem = num % 2;
			if(rem != 0 ){
				isPowerOfTwo = false;
				break;
			}
			num /= 2;
		}
		return isPowerOfTwo;
	}
}
