package com.absurd.programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FirstNonRepeatedCharInStringEff {

	class CountAndIndex{
		int count;
		int firtOccuredIndex;
	}
	
	public void getFirstNonRChar(String str){
		CountAndIndex[] counts = getCharCount(str);
		int firstOccurance = Integer.MAX_VALUE;
		char ch;
		for(int i=0;i<256;i++){
			if(counts[i]!=null && counts[i].count==1 && counts[i].firtOccuredIndex < firstOccurance){
				firstOccurance = counts[i].firtOccuredIndex;
			}
		}
		
		System.out.println(str.charAt(firstOccurance));
	}
	
	private CountAndIndex[] getCharCount(String str){
		CountAndIndex[] counts = new CountAndIndex[256];
		char[] charStr = str.toCharArray();
		for(char ch: charStr){
			
			if(counts[ch] == null){
				CountAndIndex cAndI = new CountAndIndex();
				cAndI.count = 1;
				cAndI.firtOccuredIndex = ch;
				counts[ch] = cAndI;
			}else{
				counts[ch].count++;
			}
		}
		
		return counts;
	}
}
