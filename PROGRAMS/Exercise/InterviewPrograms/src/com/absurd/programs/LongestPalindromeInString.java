package com.absurd.programs;

public class LongestPalindromeInString {

	public static void longestSubString(String str){
		longestSubstring(str.toCharArray());
	}
	public static void longestSubstring(char[] str){
		int len = str.length;
		
		//table[i][j] will be false if substring str[i..j] is not palindrome, else will be true
		boolean[][] table =  new boolean[len][];
		
		// All substrings of length 1 are palindrome
		int maxLength = 1;
		for(int i=0; i<len; i++){
			table[i][i] = true;
		}
		
		//Check for substring of length 2
		int start = 0;
		for(int i=0; i<len-1; i++){
			if(str[i] == str[i+1]){
				table[i][i+1] = true;
				start = i;
				maxLength = 2;
			}
		}
		//Check for lengths greater than 2. k is length of substring
		for(int k=3; k<=len;k++){
			
			//Fix the starting index
			for(int startingIndex=0; startingIndex<len-k+1; startingIndex++){
				
				//Get the ending index of substring from starting index i and length k
				int endingIndex = startingIndex+k-1;
				
				//checking for sub-string from startingIndex index to endingIndex, if str[startingIndex+1] to str[endingIndex-1] is palindrome
	           
				if(str[startingIndex] == str[endingIndex] && table[startingIndex+1][endingIndex-1]){
					table[startingIndex][endingIndex] = true;
					
					if(k > maxLength){
						maxLength = k;
						start = startingIndex;
					}
				}
			}			
		}
		
		//System.out.println("Longest Sub String"+ new String(str, start, start+maxLength-1));
		System.out.println("Longest Sub String  "+ new String(str, start, maxLength));
		
	}
}
