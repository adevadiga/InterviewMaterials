package com.prog.questions;

public class PermutationString {
	
	static void test(){
		String s = "anoop";
		char[] t = s.toCharArray();
		permute(t,0,t.length-1);
	}
	static void permute(char[] s, int start, int end){
		
		if(start == end){
			System.out.println(String.valueOf(s));
		}else{
			
			for(int j=start;j<=end;j++){
				swap(s, start, j);
				permute(s,start+1,end);
				swap(s, start, j);
			}
		}
		
		
	}
	
	static void swap(char[] a, int i, int j){
		char t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
}
