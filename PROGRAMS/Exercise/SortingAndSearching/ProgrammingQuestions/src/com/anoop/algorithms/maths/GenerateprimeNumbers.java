package com.anoop.algorithms.maths;

public class GenerateprimeNumbers {

	static void generatePrimes(int n){
		sieveOfEratones(n);
	}
	
	static void sieveOfEratones(int n){
		if(n >=  2){
			boolean[] numbers = new boolean[n];
			for(int index=1;index<n;index++){
				if(numbers[index] == false){
					System.out.println(index+1);
					markMultiples(numbers, index+1, n);
				}
			}
		}
	}
	
	static void markMultiples(boolean[] numbers, int markElement, int n){
		int p=2,m=0;
		while( (m = markElement*p) <=n ){
			numbers[m-1] = true;
			p++;
		}
	}
	
	public static void main(String[] args){
		generatePrimes(47);
	}
}
