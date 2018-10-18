package com.company.jpmorgan;

public class StringReverse {

	static String reverse(String s, String t){
		if(s.length() <= 0){
			return t;
		}
		return reverse(s.substring(1), s.charAt(0)+t); 
	}
	
	public static void main(String[] args){
		System.out.println(reverse("anoop",""));
	}
}
