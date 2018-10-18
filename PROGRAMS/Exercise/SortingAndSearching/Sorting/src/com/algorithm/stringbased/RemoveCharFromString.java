package com.algorithm.stringbased;

public class RemoveCharFromString {

	static String removeChar(String s,char ch)
	{
		StringBuilder newStr = new StringBuilder();
		char[] a = s.toCharArray();
		for(char c : a){
			if(ch != c){
				newStr.append(c);
			}
		}
		return newStr.toString();
	}
	static String removeChar2(String s, char ch){
		int occurance = 0;
		char[] a = s.toCharArray();
		for(char c : a){
			if(ch == c)occurance++;
		}
	  
		char[] replaced = new char[a.length-occurance];
		int i=0;
		for(char c : a){
			if(ch != c) replaced[i++] = c;
		}
		return new String(replaced);
	}
	public static void main(String[] args){
		String s = "anoop";
		System.out.println(removeChar(s, 'o'));
		System.out.println(removeChar2(s, 'o'));
	}
}
