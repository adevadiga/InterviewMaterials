package com.cci.questions;

public class UniqueCharactersInString {

	public static boolean isUniqueChars(String input){
		boolean[] charSet = new boolean[256];
		for(int i=0;i<input.length();i++){
			int value = input.charAt(i);
			if(charSet[value]){
				return false;
			}
			
			charSet[value] = true;
		}
		
		return false;
	}
	
	public static boolean isUniqueChars_NoExtraSpace(String str) {
		 int checker = 0;
		 for (int i = 0; i < str.length(); ++i) {
		 int val = str.charAt(i) - 'a';
		 if ((checker & (1 << val)) > 0) return false;
		 checker |= (1 << val);
		 }
		 return true;
	 }
}
