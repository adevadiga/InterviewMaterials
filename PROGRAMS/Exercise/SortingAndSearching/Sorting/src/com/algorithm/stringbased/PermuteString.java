package com.algorithm.stringbased;

public class PermuteString {

	static void permute(String s){
		permute("", s);
	}
	static void permute(String prefix, String rest){
		if(rest.length() < 0){
			System.out.println(prefix);
		}else{
			//prefix += rest.charAt()
			int l = rest.length();
			for(int i=0;i<l;i++){
				String restT = rest.substring(0, i)+rest.substring(i+1);
				permute(prefix+rest.charAt(i), restT);
			}
		}
	}
	
	static void permuteBackTrack(StringBuilder input, int k){
		if(k >= input.length()-1){
			System.out.println(input);
		}else{
			for(int j=k;j<input.length();j++){
				swapCharacter(input, j, k);
				permuteBackTrack(input, k+1);
				swapCharacter(input, k, j);
			}
		}
	}
	static void swapCharacter(StringBuilder input, int i, int j){
		char t = input.charAt(i);
		input.setCharAt(i, input.charAt(j));
		input.setCharAt(j, t);
		
	}
	public static void main(String[] args){
		permute("abc");
	}
}
