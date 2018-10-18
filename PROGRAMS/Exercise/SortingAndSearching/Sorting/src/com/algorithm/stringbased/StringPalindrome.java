package com.algorithm.stringbased;

public class StringPalindrome {

	static boolean isPalindrome(String s){
		return isPalindrome(s, 0, s.length()-1);
	}
	static boolean isPalindrome(String s, int startIndex, int endIndex){
		if(endIndex - startIndex < 1){
			return true;
		}
		
		return s.charAt(startIndex) ==  s.charAt(endIndex) 
				&& isPalindrome(s, startIndex+1, endIndex-1);
	}
	public static void main(String[] args){
		System.out.println(isPalindrome("anoop"));
		System.out.println(isPalindrome("abba"));
	}
}
