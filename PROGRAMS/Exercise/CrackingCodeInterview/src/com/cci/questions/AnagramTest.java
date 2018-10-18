package com.cci.questions;

public class AnagramTest {
	
	
	/*
	 * sort(s) == sort(t);
	 * 
	 */
	
	public boolean isAnagram(String s, String t){
		
		if(s == null || t == null){
			return false;
		}
		if(s.length() != t.length()){
			return false;
		}
		
		int[] letters = new int[256];
		int num_unique_chars = 0;
		int num_completed_t = 0;
		
		char[] sArray = s.toCharArray();
		
		for(char c:sArray){
			if(letters[c] == 0){
				num_unique_chars++;
			}
			
			++letters[c];
		}
		
		for(int i=0;i<t.length();i++){
			int c = t.charAt(i);
			
			if(letters[c] == 0){
				return false;
			}
			
			--letters[c];
			
			if(letters[c] == 0){
				num_completed_t++;
				if(num_completed_t == num_unique_chars){
					return i == t.length()-1;
				}
			}
		}
		
	//	return false;
		return false;
	}
	
	public boolean isAnagram_Mine(String str1,  String str2){
		
		if(str1 == null || str2 == null){
			return false;
		}
		if(str1.length() != str2.length()){
			return false;
		}
		int len = str1.length();
		int[] charCount = new int[len];
		for(int i=0;i<len;i++){
			charCount[i]=0;
		}
		
		for(int i =0; i<len;i++){
			charCount[str1.charAt(i)]++;
			charCount[str2.charAt(i)]--;
		}
		//If all zero, its an anagram
		for(int i =0; i<len;i++){
			if(charCount[i] != 0){
				return false;
			}
		}
		return true;
	}

}
