package com.anoop.algorithm.recursion;

public class Palindrome {

	public static void find(String s){
		System.out.println(isPalindrome(s,0,s.length()-1));
	}
	
	static boolean isPalindrome(String s,int startIndex, int endIndex){
		
		if(endIndex-startIndex < 1){
			return true; 
		}else{
			
			return  s.charAt(startIndex) == s.charAt(endIndex) &&  isPalindrome(s, startIndex+1, endIndex-1);
			
		}
	}
}
