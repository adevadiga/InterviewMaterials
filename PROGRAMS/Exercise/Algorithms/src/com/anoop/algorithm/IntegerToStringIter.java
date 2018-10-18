package com.anoop.algorithm;

public class IntegerToStringIter {

	public static void runMe(){
		int n= 656667;
		char[] r = itoa(n);
		for(char c: r){
			System.out.println(c);
		}
		System.out.println(r.toString());
	}
	
	static char[] itoa(int n){
		
		int ASCII_VALUE_OF_ZERO = (int)'0';
		System.out.println(ASCII_VALUE_OF_ZERO);
		
		boolean isNegative = false;
		if(n < 0){
			isNegative = true;
			n *= -1;
		}
		
		//You can handle <9 case here only
		if(n>=0 && n<=9){
			if(!isNegative){
				return new char[]{(char)(ASCII_VALUE_OF_ZERO+n)};
			}
			
			return new char[]{'-',(char)(ASCII_VALUE_OF_ZERO+n)};
			
		}
		
		char[] digits =  new char[12];
		int digitsCount = 0;
		
		while( n > 0){			
			int rem = n%10;
			digits[digitsCount++] =  (char) (ASCII_VALUE_OF_ZERO+rem);
			n/=10;
		}
		if(isNegative){
			digits[digitsCount++] = '-';
		}
		
		//Reverse the array
		digitsCount = digitsCount-1;
		for(int i=0;i<digitsCount/2;i++){
			char t = digits[digitsCount-i];
			digits[digitsCount-i] = digits[i];
			digits[i] = t;
		}
		return digits;
	}
}
