package com.prog.questions;

/*
 * Array A contains only 0s and/or 1s:
0 represents a car traveling east,
1 represents a car traveling west.
The goal is to count passing cars. We say that a pair of cars (P, Q), where 0 ≤ P < Q < N, is passing when P is traveling to the east and Q is traveling to the west.
1) Imagine array 0..N

(2) Take element X (iterate from 0 to Nth element)

(3) If value of element X is 1 then count how many 0 elements it has on left

(4) Repeat for next X
 */
public class PassingCars {
	
	public static void trst(){
		int[] a= {0,1,0,1,1};
		getPassingCars(a);
	}
	
	/*
	 * For each 1 look at how many 0's are behind
	 */
	static void getPassingCars(int[] a){
		int totalZero = 0;
		int totalPairs = 0;
		
		
		for(int i=1;i<a.length;i++){
			if(a[i] == 1){
				totalPairs += totalZero;
			}else{
				totalZero++;
			}
			
		}
		
		System.out.println("total passing cars "+totalPairs);
	}

}
