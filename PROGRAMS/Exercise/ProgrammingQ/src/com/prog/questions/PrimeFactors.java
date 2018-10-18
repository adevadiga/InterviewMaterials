package com.prog.questions;

public class PrimeFactors {
	
	static void findPrimeFactors(int n){
		
		while(n%2 == 0 ){
			System.out.println(2);
			n/=2;
		}
		
		for(int d = 3; d<=Math.sqrt(n);d+=2){
			while(n%d==0){
				System.out.println(d);
				n/=d;
			}
		}
		
		//For primes
		if(n > 2){
			System.out.println(n);
		}
		
	}

}
