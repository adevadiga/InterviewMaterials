package com.vishram.questions;

public class EvenOddWithoutDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=5;
		int k = i & 1;
		if(k == 0){
			System.out.println("Even");
		}else{
			System.out.println("Odd");
		}
		
		if( ( (i>>1)*(1<<1)) == i){
			System.out.println("EVen,,,,,,,,,,,,,,,");
		}
		
		//Without using conditional operator
		String[] s = {"Even","Odd"};
	}
	
	void recursiveEvenOdd(int n){
		if(n == 1){
			System.out.println();
		}
	}

}
