package com.anoop.algorithm.recursion;

public class AllPalindromInString {
	
	public static void printAll(){
		StringBuffer str = new StringBuffer("ABACABA");
		//new AllPalindromInString().printPalindromes(str, 0, str.length()-1);
		//System.out.println("All palindromes for String ABACABA:  ");
		//new AllPalindromInString().fuckPalindrome("ABACABA", str.length());
		
		System.out.println("All palindromes for String XYZYZMMXM:  ");
		new AllPalindromInString().fuckPalindrome("XYZYZMMXM", "XYZYZMMXM".length());
	}

	/*
	 * O(n) for recursion and in each recursion the for loops runs like for n=9,8,7,6...  1,2,3 that is O(n) ===> O(n)
	 * isPalindrome is again???
	 */
	public void fuckPalindrome(String str, int nSetOfChars){
		if(nSetOfChars < 2){
			return;
		}
		
		for(int i=0; i<=str.length()-nSetOfChars; i++){			
			String t = str.substring(i, i+nSetOfChars);
			if(isPalindrome(t)){
				System.out.println(t);
				
			}
			
		}
		fuckPalindrome(str,--nSetOfChars);		
		
	}
	public void printPalindromes(StringBuffer str,int start, int end){
		if(str.length()<=1){
			return;
		}
		
		String rest = str.substring(start+1, end);
		if(str.charAt(start) == str.charAt(end)){			
			if(isPalindrome(rest)){
				System.out.println(rest);
			}
		}
		printPalindromes(new StringBuffer(rest), 0 , rest.length()-1);
		
	}
	public boolean isPalindrome(String str){
		return isPalindrome(str, 0, str.length()-1);
	}
      boolean isPalindrome(String s,int startIndex, int endIndex){
		
		if(endIndex-startIndex < 1){
			return true; 
		}else{
			
			return  s.charAt(startIndex) == s.charAt(endIndex) &&  isPalindrome(s, startIndex+1, endIndex-1);
			
		}
	}
}
