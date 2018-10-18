package com.algorithm.stringbased;

public class RemoveDuplicateFromString {

	static void removeDuplicate(String s){
		if(s == null)
			return;
		int length = s.length();
		if(length < 2)
			return;
		boolean[] hit = new boolean[256];
		for(int i =0;i<256;i++){
			hit[i] = false;
		}
		
		int tail = 1;
		char[] sArray = s.toCharArray();
		
		for(int i = 1; i<length; i++){
			char c = sArray[i];
			if(!hit[c]){
				sArray[tail++] = c;		
				hit[c] = true;
			}
			
		}
		char[] newStrArray = new char[tail];
		System.arraycopy(sArray, 0, newStrArray, 0, tail);
		System.out.println(new String(newStrArray));
	}
	
	public static void main(String[] args){
		removeDuplicate("anoop");
		removeDuplicate("albert");
	}
	
	static void removeDuplicate2(String s){
		int tail = 1;
		char[] sArray = s.toCharArray();
		
		for(int  i =1; i<=s.length();i++){
			int j = 0;
			while(j<tail){
				if(sArray[j] == sArray[i]){
					break;
				}
				j++;
			}
			if(j == tail){
				sArray[tail++] =sArray[i]; 
			}
		}
		
	}
}
