package com.prog.questions;

public class Power {
	
	static void test(){
		System.out.println(powerOf(2,-3));
		
		System.out.println(multiple(4, 5));
	}
	
	static int powerOf(int n, int k){
		if(k == 1){
			return n;
		}
		if(k == 0){
			return 1;
		}
		if(k >= 0){
			return n*powerOf(n,k-1);
		}else{
			//Handle first case of k being negative
			return -powerOf(n, -k);
		}
	}
	
	static int multiple(int x, int y){
		if(y == 1){
			return x;
		}
		return x + multiple(x,y-1);
		
	}

}
