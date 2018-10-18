package com.algorithm.general.puzzle;

public class PascalsTraingleBinomailCoeffiecient {

	static int binaomailCoeffiecient(int n, int k){
		if(k == 1) return 1;
		if(k == n) return 1;
		return binaomailCoeffiecient(n-1,k-1)+binaomailCoeffiecient(n-1,k);
	}
	
	public static void main(String[] args){
		System.out.println(binaomailCoeffiecient(4,2));
	}
}
