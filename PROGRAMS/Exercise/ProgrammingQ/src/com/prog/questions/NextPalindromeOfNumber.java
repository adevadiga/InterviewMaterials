package com.prog.questions;

import java.util.Arrays;
import java.util.Collections;

public class NextPalindromeOfNumber {
	
	static void test(){
		//nextPalindrome(12347);
		//System.out.println(roundUp("1904"));
		nextPalindromeAweosme(23545);
		
	}

	static void nextPalindrome(int n){
		int num = n;
		int[] digits = new int[String.valueOf(num).length()];
		int i=0;
		while(num>0){
			digits[i++] = num%10;
			num/=10;
		}
		
		for (int l = 0; l < digits.length / 2; l++) {
		    int tmp = digits[l];
		    digits[l] = digits[digits.length - 1 - l];
		    digits[digits.length - 1 - l] = tmp;
		}
System.out.println(Arrays.toString(digits));
		
		for(int j=0, k=digits.length-1;j<k;){
			int x = 0;
			while( (digits[k]+x) %10 != digits[j]){
				x++;
			}
			
			int sum =  digits[k]+x;
			int overflow = sum/10 ;
			
			digits[k] = sum%10;
			digits[k-1] = digits[k-1]+overflow;
			
			System.out.println("  =>"+Arrays.toString(digits));
			
			//Adjust
			
			if(digits[j] == digits[k]){
				j++;
				k--;
			}
		}
		
		
		System.out.println(Arrays.toString(digits));
		
		
	}
	
	
	
	
	/*
	 * Awesome
	 * 
	 */
	
	static void nextPalindromeAweosme(int n){
		String num = String.valueOf(n);
		String newNum = "";
		int length = num.length();
		
		boolean isOddDigits = length%2 != 0;
		
		String leftHalf = num.substring(0, length/2);
		char middleNum = num.charAt(length/2);
		int increment = 0;
		if(isOddDigits){
			increment = (int)Math.pow(10, length/2);
			newNum = leftHalf+middleNum+new StringBuffer(leftHalf).reverse().toString();
		}else{
			increment = (int)(1.1*Math.pow(10, length/2));
			newNum = leftHalf+new StringBuffer(leftHalf).reverse().toString();
		}
		
		if(Integer.parseInt(newNum) > n){
			System.out.println(newNum);
			return;
		}
		
		if(middleNum != 9){
			newNum = String.valueOf ( Integer.parseInt(newNum)+increment  );
			System.out.println(newNum);
			return;
		}else{
			nextPalindrome(roundUp(newNum));
		}
	}
	
	static int roundUp(String num){
		int len = num.length();
		int increment = (int)Math.pow(10, ( (len/2) + 1 ));
		return (  ((Integer.parseInt(num) / increment) +1) * increment  );
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
