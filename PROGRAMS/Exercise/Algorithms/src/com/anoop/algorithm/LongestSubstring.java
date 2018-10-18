package com.anoop.algorithm;

/*
 * Dynamic Programming can be used to find the longest common substring in O(m*n) time. The idea is to find length of the longest common 
 * suffix for all substrings of both strings and store these lengths in a table.
 * The longest common suffix has following optimal substructure property
 * LCSuff(X, Y, m, n) = LCSuff(X, Y, m-1, n-1) + 1 if X[m-1] = Y[n-1]
                        0  Otherwise (if X[m-1] != Y[n-1])

 *The maximum length Longest Common Suffix is the longest common substring.
   LCSubStr(X, Y, m, n)  = Max(LCSuff(X, Y, i, j)) where 1 <= i <= m
                                                     and 1 <= j <= n

 */
public class LongestSubstring {

	public static void find(String s1, String s2){
		
		
		System.out.println(longestCommonSubstring(s1, s2, s1.length(), s2.length()));
	}
	
	/* // Create a table to store lengths of longest common suffixes of
    // substrings.   Notethat LCSuff[i][j] contains length of longest
    // common suffix of X[0..i-1] and Y[0..j-1]. The first row and
    // first column entries have no logical meaning, they are used only
    // for simplicity of program
     * 
     */
	public static int longestCommonSubstring(String s1, String s2, int m, int n){
		
		int[][] stuff =new int[m+1][n+1];
		int result = 0;
		int indexM = 0;
		int indexN=0;
		for(int i=0;i<m;i++){
			
			for(int j=0;j<n;j++){
				
				if(i==0 || j==0){
					stuff[i][j]=0;
				}
				
				else if(s1.charAt(i-1) == s2.charAt(j-1)){
					stuff[i][j] = stuff[i-1][j-1]+1;
					
					result = Math.max(result, stuff[i][j]);
					
					
				}else{
					stuff[i][j]=0;
				}
				
			}
			
		}
		System.out.println();
		return result;
	}
}
