package com.cci.questions;

public class StringRotationUsingOneSubString {

	public static boolean isRotation(String s1, String s2){
		int len = s1.length();
		if(len != 0 && len == s2.length()){
			String s1s1 = s1+s1;
			return isSubString(s2, s1);
		}
		return false;
	}
	
	public static boolean isSubString(String s, String t){
		return true;
	}
}
