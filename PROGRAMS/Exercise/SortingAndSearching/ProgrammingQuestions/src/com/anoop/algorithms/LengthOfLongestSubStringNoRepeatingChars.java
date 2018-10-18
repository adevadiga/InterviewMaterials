package com.anoop.algorithms;

public class LengthOfLongestSubStringNoRepeatingChars {

	static void longestSubStringNoRepeat(String str){
		StringBuilder longestSubString = new StringBuilder();
		StringBuilder maxLongestSubString = new StringBuilder();
		int cur_len=1;
		int max_len=1;
		int prevIndex = -1;
		int[] visited = new int[256];
		for(int i=0;i<256;i++){
			visited[i] = -1;
		}
		
		visited[0]=0;//0the element is visited
		longestSubString.append(str.charAt(0));
		
		for(int i=1;i<str.length();i++){
			prevIndex = visited[str.charAt(i)];
			if(prevIndex == -1 || i-cur_len>prevIndex){
				cur_len++;
				longestSubString.append(str.charAt(i));
			}else{
				if(cur_len > max_len){
					max_len = cur_len;
					maxLongestSubString = longestSubString;
				}
				
				cur_len = i-prevIndex;
				longestSubString = new StringBuilder(str.substring(prevIndex+1, i+1));
			}
			
			visited[str.charAt(i)] = i;
		}
		if(cur_len > max_len){
			max_len = cur_len;
			maxLongestSubString = longestSubString;
		}
		
		System.out.println(maxLongestSubString);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
