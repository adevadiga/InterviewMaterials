package com.hackersrank.pgm;

import java.util.Scanner;

public class MaxXOR {

	public static void test(){
		Scanner in = new Scanner(System.in);
		int l = in.nextInt();
		int r = in.nextInt();
		int res = findMaxXor(l,r);
		System.out.println(res);
	}
	
	
	public static int findMaxXor(int l, int r){
		
		int i = 1;
		while( l != r){
			l /= 2;
			r /= 2;
			i *= 2;
		}
		
		return i-1;
		/*int max = 0;
		for(int i=a;i<=b;i++){
			for(int j=a;j<=b;j++){
				int xorsum = i ^ j;
				if(xorsum > max){
					max = xorsum;
				}
				
			}
		}
		
		return max;*/
	}
}
