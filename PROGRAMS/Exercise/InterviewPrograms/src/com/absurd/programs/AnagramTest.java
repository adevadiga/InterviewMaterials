package com.absurd.programs;

public class AnagramTest {

	public boolean isAnagram(String s, String t){
		if(s==null || t==null){
			return false;
		}
		if(s.length() != t.length()){
			return false;
		}
		int[] lettersAndCount = new int[256];
		int num_unique_letters = 0;
		int num_complated_lettes_t = 0;
		
		char[] sArray = s.toCharArray();
		
		for(char ch:sArray){
			if(lettersAndCount[ch] == 0)  num_unique_letters++;			
			++lettersAndCount[ch];
		}
		for(int i=0;i<t.length();i++){
			int ch = t.charAt(i);			
			if(lettersAndCount[ch] == 0)
			{
			     return false; //Extra char found
			}
			--lettersAndCount[ch];
			if(lettersAndCount[ch] == 0){
				num_complated_lettes_t++;
				
				if(num_complated_lettes_t == num_unique_letters){
					return i == t.length()-1;
				}
			}
		}
		return false;
	}
}