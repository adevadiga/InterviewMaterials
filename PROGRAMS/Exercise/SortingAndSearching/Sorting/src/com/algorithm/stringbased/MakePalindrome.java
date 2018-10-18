package com.algorithm.stringbased;

import java.util.Arrays;

/*
 * Given array of String return array of same String making it palindrome if possible
 * all char in lowercase letters.
 */
public class MakePalindrome {

	static String[] makePalindromeString(String[] input)
	{
		String[] palindromes = new String[input.length];
		int k = 0;
		//String str = input[0];
		
		for(String str : input){
			char[] a = str.toCharArray();
			int len = a.length;
			boolean canBeMadePalindrome = true;
			for(int i=0;i<len/2;i++){
				char c = a[i];
				boolean charFound = false;
				int j = i+1;
				for(;j<len;j++){
					if(c == a[j]){
						charFound = true;
						break;
					}
				}
				if(charFound){
					swap(a, j, len-1-i);
				}else{
					canBeMadePalindrome = false;
					break;
				}
			}
			if(canBeMadePalindrome)
			 palindromes[k++] = new String(a);
		}
		return palindromes;
	}
	
	static String[] makePalindromeStringMine(String[] input)
	{

      return null;		
	}
	
	static void swap(char[] a, int i, int j){
		char t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	public static void main(String[] args){
		String[] s= new String[]{"ABAB","XXYYY","ANOOP"};
		s = makePalindromeString(s);
		System.out.println(Arrays.toString(s));
	}
}
