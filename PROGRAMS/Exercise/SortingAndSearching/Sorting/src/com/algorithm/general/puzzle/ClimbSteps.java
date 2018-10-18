package com.algorithm.general.puzzle;

public class ClimbSteps {

	/*
	 * There are n stairs, a person standing at the bottom wants to reach the top. 
	 * The person can climb either 1 stair or 2 stairs at a time. Count the number of ways, the person can reach the top.
	 */
	static int ways(int n){
		if(n <= 1)
			return 1;
		
		return ways(n-1)+ways(n-2);
	}
	/*Generalization of the above problem
	  How to count number of ways if the person can climb up to m stairs for a given value m? 
	  For example if m is 4, the person can climb 1 stair or 2 stairs or 3 stairs or 4 stairs at a time.
	  We can write the recurrence as following.

	  ways(n, m) = ways(n-1, m) + ways(n-2, m) + ... ways(n-m, m) */
	static int ways(int n, int m){
		return waysUtil(n+1, m);
	}
	static int waysUtil(int n, int m){
		if(n <= 1){
  		  return n;
  	  }
  	  int res = 0;
  	  for(int i=1; i<=m && i<=n;i++){
  		  res += waysUtil(n-i, m);
  	  }
  	  return res;
	}
	public static void main(String[] args) {
		System.out.println(ways(3));
		System.out.println(ways(3,2));

	}
	
	/*
	 * Note that ways(1) = fib(2) = 1
	 *           ways(2) = fib(3) = 2
	 *           ways(3) = fib(4) = 3
	 */
	static int fib(int n){
		if(n <= 1) return n;
		return fib(n-1)+fib(n-2);
	}
	static int countWays(int s){
		return fib(s+1);//Expenential
	}

	/*
	 * Dynamic Programminf
	 * 
	 */
	
	static void countWaysDP(int s, int m){
		countWaysUtilDP(s+1, m);
	}
	static int countWaysUtilDP(int n, int m){
		int[] res = new int[n];
		res[0] = 1;
		res[1] = 1;
		for(int i=2; i<n;i++){
			res[i] = 0;
			for(int j=m;j<=m && j<=i;j++){
				res[i] += res[i-j];
			}
		}
		
		return res[n-1];
	}
}
