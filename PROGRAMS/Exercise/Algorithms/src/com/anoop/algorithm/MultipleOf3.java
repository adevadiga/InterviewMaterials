package com.anoop.algorithm;

public class MultipleOf3 {
	
	public static void find(int n){
		/*//1. Remainder
		if(n%3 == 0){
			System.out.println("Multiple of 3");
		}
		
		//2. Sum bits
		int sum = 0;
		while(n > 0){
			int r = n%10;
			sum+=r%3;
			
			n=n/10;
		}
		if(sum%3 == 0){
			System.out.println("Multiple of 3");
		}*/
		
		System.out.println(new MultipleOf3().isMultipleOf3(n));
	}

   void multiplyBy(int n){
	   int m = n>>3-n;
   }
	boolean isMultipleOf3(int n){
		  if(n == 0)  return true;
		  if(n == 1) return false;
		  int oddBitCount = 0;
		  int evenBitCount = 0;
		  
		  System.out.println("hjj");
		  while( n > 0){
			  if( (n & 1) == 1){
				  oddBitCount++;
			  }
			  n = n>>1;
			  if( (n & 1) == 1){
				  evenBitCount++;
			  }
			  n = n>>1;
		  }
			System.out.println(oddBitCount+ "  "+ evenBitCount);  
		  return isMultipleOf3(oddBitCount-evenBitCount);
		}
}
