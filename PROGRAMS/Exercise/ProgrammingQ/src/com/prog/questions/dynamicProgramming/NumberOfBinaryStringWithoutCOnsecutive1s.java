package com.prog.questions.dynamicProgramming;

public class NumberOfBinaryStringWithoutCOnsecutive1s {
   /*
    * Input:  N = 2
      Output: 3
      // The 3 strings are 00, 01, 10

    */
	/*
	 * Let a[i] be the no. of binary string of length i without consecutive 1's ending with 0
	 * Let b[i] be the no. of binary string of length i without consecutive 1'2 ending with 1
	 * so base case is a[1] = b[1] = 1
	 * so a[1] -> {0} and b[1] ->  {1}
	 * For the string which ends with 0, we can prefix it with either 0 or 1, but
	 * for the string which ends with 1, u can append only 1
	 * i.e   a[2] = a[1] + b[1] and b[2] = a[1]
	 * 
	 * a[i] = a[i-1] + b[i-1]
	 * b[i] = a[i-1]
	 * 
	 * And total digits a[i]+b[i]
	 */
	
	static int find(int n){
		int[] a = new int[n];
		int[] b = new int[n];
		
		a[0] = b[0] = 1; //Assume +1
		
		for(int i=1; i<n ; i++){
			a[i] = a[i-1] + b[i-1];
			b[i] = a[i-1];
		}
		
		return a[n-1]+b[n-1];
	}
	
	
}
