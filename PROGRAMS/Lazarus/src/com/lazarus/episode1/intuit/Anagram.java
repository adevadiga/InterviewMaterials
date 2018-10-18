package com.lazarus.episode1.intuit;

public class Anagram {
	
	public static boolean anagram(String s, String t){
		if(s.length() != t.length()){
			return false;
		}
		
		char[] letters = new char[128];
		int numUniqueChars = 0;
		int numCharComplteted_t = 0;
		for(int i=0; i<s.length();i++){
			int c = s.charAt(i);
			if(letters[c] == 0){
				numUniqueChars++;
			}
			letters[c]++;
		}
		
		for(int i=0;i<t.length();i++){
			int c = t.charAt(i);
			if(letters[c] == 0){
				return false;//Char not in S found int t
			}
			
			--letters[c];
			
			if(letters[c] == 0){
				numCharComplteted_t++;
				
				if(numCharComplteted_t == numUniqueChars){
					return true;//return i == t.length()-1;
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args){
		String s = "anoop";
		String t = "apooa";
		System.out.println(anagram(s, t));
	}

}
