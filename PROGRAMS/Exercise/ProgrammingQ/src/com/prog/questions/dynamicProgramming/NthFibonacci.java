package com.prog.questions.dynamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class NthFibonacci {

	public static void test(){
		System.out.println(findFib(8));
	}
	static Map<Integer, Integer> fibs = new HashMap<Integer, Integer>();
	static{
		fibs.put(0, 0);
		fibs.put(1,1);
	}
	/*
	 * Top Down
	 */
	static Integer findFib(int n){
		
		if(fibs.get(n) == null){
			fibs.put(n, findFib(n-1)+findFib(n-2));
		}
		
		return fibs.get(n);
	}
	
	/*
	 * Botttom up
	 */
	static int fibBottomUp(int n){
		if(n == 0){
			return 0;
		}
		
		int prevFib = 0, currentFib =1;
		while(n-1 > 0){
			int newFib = prevFib+currentFib;
			prevFib = currentFib;
			currentFib = newFib;
		}
		return currentFib;
	}
}
