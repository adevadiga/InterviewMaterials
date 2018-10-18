package com.absurd.programs;

public class PrintAllPalindromesOfString {

	public static void printAllPalindromes(String str){
		printAllPalindromes(str.toCharArray());
		
	}
	public static void printAllPalindromes(char[] str){
		int len = str.length;
		boolean[][] table =  new boolean[len][len];
		for(int i=0;i<len;i++){
			table[i][i] = true;
		}
		//2 length palindrome
		for(int i=0;i<len-1;i++){
			if(str[i] == str[i+1]){
				table[i][i+1] = true;
				System.out.println(new String(str, i, 2));
			}
		}
		
		for(int k=3; k<=len; k++){
			
			//Fix starting index
			for(int startingIndex = 0; startingIndex < len-k+1; startingIndex++){
				int endingIndex = startingIndex+k-1;
				if(str[startingIndex] == str[endingIndex] && table[startingIndex+1][endingIndex-1] ==  true){
					table[startingIndex][endingIndex] = true;
					System.out.println(new String(str, startingIndex, k));
				}
			}
		}
		
	}
	
}
