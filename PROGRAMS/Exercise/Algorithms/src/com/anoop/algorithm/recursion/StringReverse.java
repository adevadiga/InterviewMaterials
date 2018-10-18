package com.anoop.algorithm.recursion;

public class StringReverse {
	
	public static void hush(){
		String s="Anoop";
		char[] s2=s.toCharArray();
		char[] r = reverse(s2, 0, s2.length-1);
		for(char i:r){
			System.out.print(i);
		}
		System.out.println(r.toString());
	}

	static char[] reverse(char[] s, int startIndex, int endIndex){
		if(endIndex - startIndex < 1){
			return s;
		}
	    char t = s[startIndex];
	    s[startIndex]=s[endIndex];
	    s[endIndex]=t;
	    
	    return reverse(s, startIndex+1, endIndex-1);
	}
	
	
	/*************/
	
	static String r(String str){
		if(str == null || str.length()<=1){
			return str;
		}else{
			return r(str.substring(1))+str.charAt(0);
			
			
		}
	}
}
