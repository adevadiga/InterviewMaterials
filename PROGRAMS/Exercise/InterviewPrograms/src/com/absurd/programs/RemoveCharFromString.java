package com.absurd.programs;

public class RemoveCharFromString {

	public static String removeAll(String str, char replace){
		Long start  = System.currentTimeMillis();
		char[] strChar = str.toCharArray();
		//Count the occurance
		int occurance = 0;
		for(char ch: strChar){
			if(ch == replace){
				occurance++;
			}
		}
		char[] replaceStr = new char[str.length()-occurance];
		int i = 0;
		for(char ch: strChar){
			if(ch != replace){
				replaceStr[i++] = ch;
			}
		}
		Long end  = System.currentTimeMillis();
		System.out.println("Time taken: "+(end-start));
		return new String(replaceStr);
	}
	
	public static String removeAllStrBuilder(String str, char ch){
		Long start  = System.currentTimeMillis();
		StringBuilder strb = new StringBuilder();
		char[] strChar = str.toCharArray();
		for(char c:strChar){
			if(c != ch){
				strb.append(c);
			}
		}
		Long end  = System.currentTimeMillis();
		System.out.println("Time taken: "+(end-start));
		return strb.toString();
	}
}
