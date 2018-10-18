package com.absurd.programs.numbers;

public class ClimbSteps {

	/*
	 * There are n stairs, a person standing at the bottom wants to reach the top. 
	 * The person can climb either 1 stair or 2 stairs at a time. Count the number of ways, the person can reach the top.
	 */
	public int ways(int step){
		if(step <= 1){
			return 1;
		}
		return ways(step-1)+ways(step-2);
	}
	
	/*Generalization of the above problem
	  How to count number of ways if the person can climb up to m stairs for a given value m? 
	  For example if m is 4, the person can climb 1 stair or 2 stairs or 3 stairs or 4 stairs at a time.
	  We can write the recurrence as following.

	  ways(n, m) = ways(n-1, m) + ways(n-2, m) + ... ways(n-m, m) */
      public int countways(int n, int m){
    	 //return  countWaysUtil(n+1, m);
    	  return countWaysUtilDP(n+1, m);
      }
      public int countWaysUtil(int n, int m){
    	  if(n <= 1){
    		  return n;
    	  }
    	  int res = 0;
    	  for(int i=1; i<m && i<n;i++){
    		  res += countWaysUtil(n-i, m);
    	  }
    	  return res;
      }
      
      /*
       * DP solution 
       */
      public int countWaysUtilDP(int n, int m){
    	  int[] result = new int[n];
    	  result[0] = 0;
    	  result[1] = 1;
    	  for(int i=2;i<=n;i++){
    		  result[i] = 0;
    		  for(int j=1; j<=m && j<=i;j++){
    			  result[i] += result[i-j];
    		  }
    	  }
    	  return result[n-1];
      }

}
