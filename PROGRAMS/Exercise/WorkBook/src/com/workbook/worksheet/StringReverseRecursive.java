package com.workbook.worksheet;

public class StringReverseRecursive {
	
	

	public static String reverse(String str){
		if(str == null || str.length() == 1){
			return str;
		}
	
		return str.charAt(str.length()-1)+reverse(str.substring(0, str.length()-1));		
	}
	
	public static String reverseAlt(String str){
		char[] s = str.toCharArray();
		int start = 0;
		int end = s.length-1;
		while(start < end){
			swap(s, start, end);
			start++;
			end--;
		}
		return new String(s);
	}
	
	private static void swap(char[] a, int i, int j){
		char t = a[i];
		a[i] = a[j];
		a[j] =t;
	}
	public static int reversNumber(int num){
		int newNum = 0;
		while(num != 0){
			int r = num%10;
			newNum = newNum*10 + r;
			num /= 10;
		}
		return newNum;
	}
}
