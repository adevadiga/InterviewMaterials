package com.prog.questions;

public class PalindromesInString {
	
	public static void test(){
		listPalindromes("abba");
	}

	static void listPalindromes(String str){
		int len = str.length();
		for(int i=0;i<len-1;i++){
			int iIndex = i;
			StringBuffer t = new StringBuffer();
			for(int j=len-1;j>i;j--){
				
				
				if(str.charAt(i) != str.charAt(j)){
					
					if(i == j-1){
						System.out.println(str.substring(i, j+1));
					}
					
					break;
				}else{
					System.out.println();
				}
				i++;
				
			}
			
			i = iIndex;
			
			
		}
		
	}
}
