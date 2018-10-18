package com.anoop.algorithm;

public class IFibonacci {

public	static void iterativeFib(){
		System.out.println(fib(14));
	}
	
	static int fib(int n){
		
		if(n<=2){
			return n;
		}
		int a=1,b=1,c;
		System.out.print(a+" , "+b+" , ");
		
		for(int i=0; i<=n-3;i++){
			c = a+b;
			a = b;
			b = c;
			
			System.out.print(b+" , ");
			
		}
		
		return b;
	}
}
