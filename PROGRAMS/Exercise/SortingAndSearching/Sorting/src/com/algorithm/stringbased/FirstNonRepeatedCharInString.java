package com.algorithm.stringbased;

public class FirstNonRepeatedCharInString {

	static void usingCharCounter(String s){
		char[] letters = new char[256];
		char[] sArray = s.toCharArray();
		for(char c:sArray){
			letters[c]++;
		}
		
		for(char c:sArray){
            if(letters[c] == 1){
            	System.out.println(c);
            	break;
            }
		}
	}
	
	public static void main(String[] args){
		usingCharCounter("anoopan");
	}
}
