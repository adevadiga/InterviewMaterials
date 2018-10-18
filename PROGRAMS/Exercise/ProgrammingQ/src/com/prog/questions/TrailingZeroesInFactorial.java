package com.prog.questions;

public class TrailingZeroesInFactorial {

	public  static  int  findTrailingZeros(int  n)  

	{

	    int cnt = 0, temp = 5; 

	    if(n < 0){

	        System.out.println("Error: There is no Factorial for a number less than 0");

	        return -1; //error condition

	    }

	     

	    while(temp < n) 

	    { 

	        cnt += n / temp; 

	        temp *= 5; 

	    } 

	    return cnt;

	}

}
