package com.cci.questions;

public class RemoveDuplicatesFromString {

	/*1. For each character, check if it is a duplicate of already found characters.
	  2. Skip duplicate characters and update the non duplicate characters.*/
	public static void remove(char[] str){
		
		if(str == null){
			return;
		}
		int len = str.length;
		if(len < 2){
			return;
		}
		int tail = 1;
		
		for(int i=1; i<len;i++){
			int j;
			for(j=0;j<tail;j++){
				if(str[i] ==  str[j]){
					break;
				}
			}
			if(j == tail){
				str[tail] = str[i];
				tail++;
			}
		}
		str[tail]=0;
	}
	
	public static void removeEffiecient(char[] a){
		if(a == null){
			return;
		}
		int len = a.length;
		if(len < 2){
			return;
		}
		
		boolean[] hit = new boolean[256];
		for(int i =0;i<256;i++){
			hit[i] = false;
		}
		
		hit[a[0]] = true;//Mark first char
		int tail = 1;
		for(int i =1; i<len; i++){
			if(!hit[ a[i]] ){
				a[tail] = a[i];
				tail++;
				hit[ a[i] ] = true;				
			}
		}
		
		a[tail]=0;
		
		
	}
}
