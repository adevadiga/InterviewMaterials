package com.anoop.algorithms;

/*
 * DOES NOT WORK */
public class PalindromesInString {

	static void printPalindromes(String str){
		
		for(int i = 0; i<str.length()-1;i++){
			
			int iIndex = i;
			int j = str.length()-1;
			for(; j>i;j--){
				
				if(str.charAt(i) != str.charAt(j)){
					if(i == j-1){
				    	System.out.println(str.substring(i, j+1));	//Till j
					}
					break;//Break out and start from next i
				}else{
					System.out.println();
				}
				i++;
			}
			
			if(i-1 == j+1){
				System.out.println(str.substring(iIndex, j+1));
			}
			i = iIndex; //Start over from next i
		}
	}
	
	public static void main(String[] args){
		String a = "abba";
		printPalindromes(a);
	}
}
