package com.prog.questions.series;

public class ReplaceZeroWithFive {

	public static int replace(int n){
		if(n == 0){
			return 0;
		}
		int digit = n%10;
		if(digit == 0){
			digit = 5;
		}
		
		return replace(n/10)*10+digit;
	}
}
