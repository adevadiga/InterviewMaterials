package com.prog.questions;

import java.util.Arrays;

public class LexiographicPermutation {
	
	public static void test(){
		sortedPermutaion("BAC".toCharArray());
	}

	
	static int findCeil(char[] str, int first, int l, int h){
		
		int ceilIndex = l;
		
		for(int i = l+1; i <=h ; i++){			
			if( str[i] > first && str[i] < str[ceilIndex] ){
				ceilIndex = i;
			}			
		}
		return ceilIndex;
	}
	
	static void sortedPermutaion(char[] str){
		int length = str.length;
		// Sort the string in increasing order
		Arrays.sort(str);
		
		boolean isFinished = false;
		
		while(!isFinished){
			
			//Print this permutation
			System.out.println(Arrays.toString(str));
			
			// Find the rightmost character which is smaller than its next
	        // character. Let us call it 'first char' --  
	        int i = length-2;
	        
	        for(;i>=0;i--){
	        	if(str[i] < str[i+1]){
	        		break;
	        	}	        	
	        }
	        
	     // If there is no such chracter, all are sorted in decreasing order, finish it
	        if(i == -1){
	        	isFinished = true;
	        }else{
	        	 // Find the ceil of 'first char' in right of first character.
	            // Ceil of a character is the smallest character greater than it
	        	int ceilIndex =  findCeil(str, str[i], i+1, length-1);
	        	swap(str, i, ceilIndex);
	        	
	        	// Sort the string on right of 'first char'
	        	Arrays.sort(str, i+1, length);
	        	
	        	
	        	
	        }
	        
		}
		
	}
	
	static void swap(char[] str, int i, int j){
		char t = str[i];
		str[i] = str[j];
		str[j] = t;
	}
}
