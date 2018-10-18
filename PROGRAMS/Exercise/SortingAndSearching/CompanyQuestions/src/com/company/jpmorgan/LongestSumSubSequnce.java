package com.company.jpmorgan;

import java.util.Scanner;

public class LongestSumSubSequnce {

	
	static int longestSumSubsequenceInString(String s ){
		int maxEndingHere = 0;
		int maxSoFar = 0;
		
		Scanner scanner = new Scanner(s);
		while(scanner.hasNext()){
			int x = scanner.nextInt();
			maxEndingHere = Math.max (maxEndingHere+x, x);
			maxSoFar = Math.max(maxSoFar, maxEndingHere);
		}
	}
	
	/*
	 * O(n2)
	 */
	static void findLongestSumSubSequence(String str){
		int maxEndingHere = 0;
		int maxSoFar = 0;
		
		Scanner scanner = new Scanner(str);
		while(scanner.hasNext()){
			int x = scanner.nextInt();
			maxEndingHere = Math.max(x, maxEndingHere+x);
			maxSoFar = Math.max(maxEndingHere, maxSoFar);
		}
		
		System.out.println("Max is "+maxSoFar);
	}
	
	public static void main(String[] args){
		String str = "-2+1-3+4-1+2+1-5+4"; 
		str = str.replaceAll("([+-])", " $1");
		findLongestSumSubSequence(str);
	}
}
