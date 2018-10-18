package com.algorithm.stringbased;

public class AnagramTestAlgorithm {
	
	static boolean isAnagram(String s, String t){
		if(s == null || t == null)	
			return false;
		if(s.length() != t.length())
			return false;
		
		char[] letters = new char[256];
		int num_unique_chars = 0;
		int num_completed_char_t = 0;
		
		char[] sArray = s.toCharArray();
		for(int i = 0;i<sArray.length;i++){
			char c = sArray[i];
			if(letters[c] == 0){
				num_unique_chars++;
			}
			
			letters[c]++;
		}
		char[] tArray = t.toCharArray();
		for(int i = 0;i<tArray.length;i++){
			char c = tArray[i];
			if(letters[c] == 0){
				return false;//Extra char found
			}
			
			letters[c]--;
			
			if(letters[c] == 0){
				num_completed_char_t++;//Increment completed chars in t
				
				if(num_completed_char_t == num_unique_chars){//If this is the case c should be last char of t
				  return i == tArray.length-1;	
				}
			}
		}
		
		return false;
	}
	

}
