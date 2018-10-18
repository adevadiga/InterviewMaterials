package com.algorithm.general.puzzle;

public class MakeChangeNCentsProbelm {

	static int makeChange(int n){
		return makeChange(n, 25);
	}
	static int makeChange(int n, int denom){
		int nextDenom = 0;
		switch(denom){		
			case 25: nextDenom = 10;
			         break;
			case 10: nextDenom = 5;
	                 break;
			case 5: nextDenom = 1;
					 break;
			case 1: return 1;
		}
		int ways = 0;
		for(int i=0; i*denom<=n;i++){//Zero is imp
			ways += makeChange(n-i*denom, nextDenom);
		}
		
		return ways;
	}
}
