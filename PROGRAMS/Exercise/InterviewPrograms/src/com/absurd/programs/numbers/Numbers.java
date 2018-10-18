package com.absurd.programs.numbers;

import java.util.ArrayList;
import java.util.List;

public class Numbers {

	public boolean isPowerOfTwo(int n){
		int num = n;
		int rem;
		while(num != 1){
			rem = num % 2;
			if(rem != 0 ){
				return false;				
			}
			num /= 2;
		}
		return true;
	}
	
	public boolean isPowerOfTwoOneLiner(int n){
		return n != 0 && ( (n & n-1) == 0 );
	}
	
	public boolean isPalindrome(int n){
		int num = 0;
		int r;
		int n2 = n;
		while(n2 != 0){
			r = n2%10;
			num = num*10 + r;
			n2 /= 10;
		}
		return n == num;
	}
	boolean isPalindromeNoOver(int x) {
	    if (x < 0)
	        return false;
	    int div = 1;
	    while (x / div >= 10) {
	        div *= 10;
	    }
	    while (x != 0) {
	        int l = x / div;
	        int r = x % 10;
	        if (l != r)
	            return false;
	        x = (x % div) / 10;
	        div /= 100;
	    }
	    return true;
	}
	
	public int nthFibonacci(int n){
		if(n == 1 ){
			return 0;
		}
		if(n == 2){
			return 1;
		}
		return nthFibonacci(n-1)+nthFibonacci(n-2);
	}
	
	public int nthFibonacciAdditive(int n, int t1, int t2){
		if(n == 1) return t1;
		if(n == 2) return t2;
		return nthFibonacciAdditive(n-1, t2, t1+t2);
	}
	
	public int sumOfDigitsRecur(int n){
		if(n < 10){
			return n;
		}
		return n%10+sumOfDigitsRecur(n/10);
	}
	
	public Integer[] primeFactors(int n){
		List<Integer> pF = new ArrayList<Integer>();
		int noOfPF = 0;
		boolean incrementI = true;
		for(int i = 2; i<=Math.sqrt(n);){
			incrementI = true;
			if(n % i == 0){
				pF.add(i);
				incrementI = false;
				noOfPF++;
			}
			
			n /= i;
			if(incrementI){
				i++;
			}
		}
		
		return pF.toArray(new  Integer[pF.size()]);
	}
	
	
}
