package com.absurd.programs.misc;

public class CompressString {

	/*
	 * One was to compress a string. For ex. i/p string is aaabbbbccaa then o/p is a3b4c2
	 */
	public static String compressString(String str){
		if(str == null || str.length() == 0){
			return str;
		}
		char[] strChar = str.toCharArray();
		StringBuffer buffer = new StringBuffer();
		for(int i=0;i<strChar.length;){
			buffer.append(strChar[i]);
			int runningCounter = i+1;
			int runningLen= 1;
			while(runningCounter < strChar.length && strChar[i] == strChar[runningCounter] ){
				runningLen++;
				runningCounter++;
			}
			if(runningLen > 1){
				buffer.append(runningLen);
			}
			i = runningCounter;
		}
		
		System.out.println(buffer);
		return buffer.toString();
	}
}
