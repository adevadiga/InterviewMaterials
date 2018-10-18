package com.anoop.algorithm.analysis;

public class FibonacciAsGoldenRatio {
	
	private static final double GOLDEN_RATIO = (1+Math.sqrt(5.0))/2;
	public static void calculate(){
		System.out.println(new FibonacciAsGoldenRatio().fib(12));
	}
	/*
	 * fib(n) = φ^n/(sqrt(5)   where φ is golden ratio
	 */
   int fib(int n){
	   
	   double golderPowerOfN = findGoldenRationPower(GOLDEN_RATIO, n);
	   Double val = golderPowerOfN/(Math.sqrt(5.0));
	   return val.intValue();
	 
	   
   }
   
  double findGoldenRationPower(double n, int k){
	   if(k==0){
		   return 1.0;
	   }
	   if(k ==1){
		   return GOLDEN_RATIO;
	   }
	   
	  return n*findGoldenRationPower(n, k-1);
	  // return findGoldenRationPower(n, k/2)*findGoldenRationPower(n, (n.-(k/2))); 
   }
}
