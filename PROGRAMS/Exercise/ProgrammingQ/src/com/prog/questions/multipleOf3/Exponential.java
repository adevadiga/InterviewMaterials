package com.prog.questions.multipleOf3;

public class Exponential {

	public static void test(){
		findExponential(3, 1.0);
	}
	static void findExponential(int n, double x){
		double sum = 1.0;
		
		for(int i=n-1;i>0;i--){
			sum = 1 + (x/i) * sum;
		}
		
		System.out.println(sum);
	}
}
