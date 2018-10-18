package com.prog.questions;

public class PrimeNumbers {

	static void test(){
		sieveOfEratones(41);
	}
	
	static void sieveOfEratones(int n){
		
		if(n >= 2){
			boolean[] numbers = new boolean[n];
			
			for(int index = 1; index < n;index++){
				if(numbers[index] == false){
					System.out.println(index+1);
					markMultiple(numbers, index+1, n);
				}
			}
		}
		
	}
	
	static void markMultiple(boolean[] a, int markElement, int n){
		int p=2, m=0;
		while( (m =markElement*p) <= n){
			a[m-1] = true;
			p++;
		}
	}
}
