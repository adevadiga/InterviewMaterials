package com.hackersrank.pgm;

import java.util.Scanner;

public class TimeToText {

	public static void convert(){
		Scanner in = new Scanner(System.in);
		int h = in.nextInt();
		in.next();
		int m = in.nextInt();
		
		String[] numbers = new String[]{"", "one", "two", "three", "four", "five", "six","seven","eight","nine",
				"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen",
				"ninteen","twenty","twenty one","twenty two","twenty three","twenty four","twenty five","twenty six","twenty seven","twenty eight",
				"twenty nine"};
		String tellMetheTime = "";
		
		if(m == 0){
			tellMetheTime = numbers[h]+" 'O clock";
		}else if(m == 30){
			tellMetheTime = "half past "+numbers[h];
		} else if(m >0 && m<30){
			tellMetheTime = numbers[m]+" minute"+(m==1?"":"s")+" past "+numbers[h];
		}else{
			tellMetheTime = numbers[60-m]+" minute"+(m==59?" ":"s")+" to "+numbers[h+1];
		}		
		System.out.println(tellMetheTime);
	}
}