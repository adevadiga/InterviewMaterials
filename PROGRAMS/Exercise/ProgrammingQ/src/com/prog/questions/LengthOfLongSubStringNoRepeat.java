package com.prog.questions;

public class LengthOfLongSubStringNoRepeat {

	public static  void lenSubStr(String str){
		StringBuffer longestSubString  = new StringBuffer("");
		StringBuffer MaxlongestSubString  = new StringBuffer("");
		int cur_len=1;
		int max_len=1;
		int prevIndex = -1;
		int[] visited = new int[256];
		for(int i=0; i<256;i++){
			visited[i]=-1;
		}
		
		visited[0]=0;
		longestSubString.append(str.charAt(0));
		
		for(int i=1;i<str.length();i++){
			prevIndex = visited[str.charAt(i)];
			if(prevIndex == -1 || i - cur_len > prevIndex){
				cur_len++;
				longestSubString.append(str.charAt(i));
			}else{
				//CHanging max substring
				if(cur_len > max_len){
					max_len = cur_len;
					MaxlongestSubString = longestSubString;
				}
				
				
				cur_len = i-prevIndex;
				longestSubString = new StringBuffer(str.substring(prevIndex+1, i+1));
			}
			
			visited[str.charAt(i)] = i;//****
		}
		
		if(cur_len > max_len){
			max_len = cur_len;
			MaxlongestSubString = longestSubString;
		}
		
		System.out.println(max_len);
		System.out.println(MaxlongestSubString);
	}
}
