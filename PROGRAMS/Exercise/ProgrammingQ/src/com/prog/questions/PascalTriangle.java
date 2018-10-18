package com.prog.questions;

import java.util.Arrays;

public class PascalTriangle {
	
	 static void test(){
		 //worst(6);
		 printPascal(6);
	 }
	/*
	 * 1
	 * 1 1
	 * 1 2 1
	 * 1 3 3 1
	 * 1 4 6 4 1
	 */
	static void worst(int n){
		
		for(int line = 0; line < n; line++){
			for(int i=0; i<=line;i++){
				System.out.print(binomailCoefficeint(line , i));
			}			
			System.out.println();			
		}
	}
	
	static int binomailCoefficeint(int n, int k){
		
		if(n-k < k){
			k = n-k;
		}
		int result = 1;
		for(int i=0; i<k;i++){
			result *= n-i;
			result /= k-i;
		}
		
		return result;
	}
	
	/*
	 * 6
	 *  C
	 *   2
	 */
	static int pascalTraingle(int n, int k){
		if(k == 0 || k==n){
			return 1;
		}
		if(n ==  1){
			return 1;
		}
		return pascalTraingle(n-1, k-1)+pascalTraingle(n-1, k);
	}
	
	/*
	 *Print pascal 
	 * 
	 */
	static void printPascal(int n){
		
		int[][] pascal = new int[n][n];		
		
		for(int line=0; line < n; line++){
			for(int i=0;i<=line;i++){
				if(i == 0 || i==line){
					pascal[line][i] = 1;
				}else{
					pascal[line][i] = pascal[line-1][i-1]+pascal[line-1][i];
				}
			}
		}
		
		
		printArray(pascal);
		
	}

	static void printArray(int[][] a){
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print(a[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
