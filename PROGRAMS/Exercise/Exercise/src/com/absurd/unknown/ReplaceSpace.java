package com.absurd.unknown;

public class ReplaceSpace {
	
	
	public String replaceSpaceinString(String str){
		char[] s = str.toCharArray();
		int length = str.length();
		int numOfSpace = 0;
		for(int i = 0; i < length; i++){
			if(s[i] == ' '){
				numOfSpace++;
			}
		}
		
		int newStrLength = length + numOfSpace*2;
		char[]  newS = new char[newStrLength];
		int index = newStrLength-1;
		for(int i=length;i>0;i--){
			if(s[i] == ' '){
				newS[index] = '0';
				newS[index-1] = '2';
				newS[index-2] = '%';
				index-=3;
			}else{
				newS[index] = s[i];
				index--;
			}
		}
	}

}
