package com.cci.questions;

public class ReplaceSpaceWithHtmlEscape {
	
	public static void replace(char[] str){
		int spaceCount = 0, newLength = 0;
		
		for(int i=0;i<str.length;i++){
			if(str[i] == ' '){
				spaceCount++;
			}
		}
		
		newLength = str.length + 2*spaceCount;
		char[] encodeStr = new char[newLength];
		//encodeStr[newLength] = '\0';
		int index = 0;
		for(int i=0;i<newLength;i++){
			if(str[i] == ' '){
				encodeStr[index++] = '%';
				encodeStr[index++] = '2';
				encodeStr[index++] = '0';
			}else{
				encodeStr[index++] = str[i];
			}
		}
		
	}

}
