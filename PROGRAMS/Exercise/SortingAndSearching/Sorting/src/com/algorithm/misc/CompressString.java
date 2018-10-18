package com.algorithm.misc;

/*
 * One was to compress a string. For ex. i/p string is aaabbbbccaa then o/p is a3b4c2
 */
public class CompressString {

	static void compress(String s){
		StringBuilder compressedString = new StringBuilder();
		char[] charsOfS = s.toCharArray();
	    int len = s.length();
	    for(int i=0;i<len;i++){
	    	compressedString.append(charsOfS[i]);
	    	int noOfOccurance = 1;
	    	int j = i+1;
	    	while(j<len && charsOfS[i] == charsOfS[j]){
	    		noOfOccurance++;
	    		j++;
	    	}
	    	i = j-1;//Note the above j=i+1 assignment
	    	if(noOfOccurance > 1)
	    		compressedString.append(noOfOccurance);
	    }
	    
	    System.out.println(compressedString);
	}
	public static void main(String[] args){
		String s = "aaabbbbccaa";
		compress(s);
	}
}
