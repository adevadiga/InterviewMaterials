package com.hackersrank.pgm;

import java.util.Scanner;

public class FindDigits {

	public static void findDigitsWHichDevideN(long n){
		long num = n;
		int totalDigitsDevides = 0;
		while(num != 0){
			long r = num%10;
			if(r != 0 && n % r== 0){
				totalDigitsDevides++;
			}
			
			num /= 10;
			
		}
		System.out.println(totalDigitsDevides);
		
	}
	public static void find(){
		Scanner in =  new Scanner(System.in);
		int noOfTestCases = in.nextInt();
		for(int i=0;i<noOfTestCases;i++){
			long n = in.nextLong();
			findDigitsWHichDevideN(n);
		}
	}
}
