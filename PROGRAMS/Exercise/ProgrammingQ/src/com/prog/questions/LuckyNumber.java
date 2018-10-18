package com.prog.questions;

public class LuckyNumber {
	static int counter = 2;
	
	static boolean isLuckyNumber(int n){
		int nextPositionOfN = n;
		if(n > counter){
			return false;
		}
		
		if(n % counter == 0){
			return true;
		}
		nextPositionOfN = nextPositionOfN - (n/counter);
		counter++;
		return isLuckyNumber(nextPositionOfN);
	}

}
