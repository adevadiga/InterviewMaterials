package com.workbook.worksheet;

public class JavaParseInt {

	public static int parseInt(String str) throws NumberFormatException{
		int result = 0;
		int limit = -Integer.MAX_VALUE;
		int multilimit = 0;
		int digit = 0;
		boolean isNeagtive = false;
		int i=0;
		int radix =10;
		int len = str.length();
		
		if(len > 0){
			char firstChar = str.charAt(0);
			if(firstChar < '0'){
				if(firstChar=='-'){
					isNeagtive = true;
					limit = Integer.MIN_VALUE;
				}else{
					throw new NumberFormatException("String wrong number");
				}
				if(len == 1){
					throw new NumberFormatException("String wrong number");
				}
				
				i++;
			}
			
			
			multilimit = limit/radix;
			while(i < len){
				digit = str.charAt(i++)-'0';
				if(digit < '0'){
					throw new NumberFormatException("String wrong number");
				}
				if(result < multilimit){
					throw new NumberFormatException("String out of range");
				}
				result *= radix;
				if(result < limit+digit){
					throw new NumberFormatException("String out of range");
				}
				
				result -= digit;
			}
						
		}else{
			throw new NumberFormatException("String is empty");
		}
		
		
		return isNeagtive?result:-result;
	}
}
