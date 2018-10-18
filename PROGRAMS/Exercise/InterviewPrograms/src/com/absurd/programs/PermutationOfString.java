package com.absurd.programs;

import java.util.ArrayList;
import java.util.List;

public class PermutationOfString {
	
	public static void permuteString(String str){
		//permuteRecursive("", str);
		//permuteBackTrackRecursive(new StringBuilder(str),0);
		List<String> perms = permuterIterative(str);
		for(String p:perms){
			System.out.println(p);
		}
	}

	public static void permuteRecursive(String prefix, String rest){
		//If rest is empty print prefix
		if(rest.length() < 1){
			System.out.println(prefix);
		}else{
			//For each char in rest,
			//1. add that char to prefix
			//2. remove that char from rest
			//3. call permute
			int len = rest.length();
			for(int i=0; i<len;i++){
				String newPrefix = prefix + rest.charAt(i);
				String newRest = rest.substring(0, i)+rest.substring(i+1, len);
				permuteRecursive(newPrefix, newRest);
			}
		}
		
	}
	/*Back Tracking.....................................................................*/
	public static void permuteBackTrackRecursive(StringBuilder str, int k){
		if(k >= str.length()-1){
			System.out.println(str);
		}else{
			
			for(int j=k ; j<str.length(); j++){
				swapCharacter(j, k, str);
				permuteBackTrackRecursive(str, k+1);
				swapCharacter(k, j, str); //Backtrack here
			}
		}
	}	
	static void swapCharacter(int i, int j, StringBuilder input){
		char t = input.charAt(i);
		input.setCharAt(i, input.charAt(j));
		input.setCharAt(j, t);
		
	}
	
	/************Iterating **************************************************************/
	//PENDING
	public static List<String> permuterIterative(String str){
		if(str == null || str.length() < 1){
			return null;
		}
		List<String> permutations = new ArrayList<String>();
		
		permutations.add(Character.toString(str.charAt(0)));
		int len = str.length();
		for(int i=1; i<len;i++){
			
			char character = str.charAt(i);
			
			int sizeOfList = permutations.size();
			for(int j=0; j<sizeOfList;j++){
				String strprocessedTillNow = permutations.remove(j);
				
				for(int k=0; k<=strprocessedTillNow.length(); k++) {
					permutations.add(strprocessedTillNow.substring(0,k) + character + strprocessedTillNow.substring(k));
	            }
				//permutations.add( strprocessedTillNow.substring(0, j) + character + strprocessedTillNow.substring(j));
			}
			
		}
		
		return permutations;
	}
}
