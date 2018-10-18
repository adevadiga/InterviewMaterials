package com.anoop.algorithm.recursion;

public class Fibonacci {

	public static void find(int n){
		System.out.println(fib(n));
	}
	
	static int fib(int n){
		if(n==0 || n==1)
		{
			return n;
		}else{
			return fib(n-1)+fib(n-2);
		}
		
	}
	
	/*
	 * Count number of function call made to compute Fib via recursion
	 */
	public static void countFibPrinter(){
		System.out.println("Number of calls..");
		System.out.println("N    noOfCalls");
		for(int i=1; i<=10; i++){
			System.out.println(i+"    "+countFib(i));
			
		}
	}
	static int countFib(int n){
		if(n == 0 || n==1){
			return 1;
		}
		
		return 1+countFib(n-1)+countFib(n-2);
	}
}
