package com.prog.questions.mySolutions;

public class LongestUniqueSubString {

	public static void test(){
		System.out.println("BANGALORED");
		longest("BANGALORED");
		System.out.println();
		longest2("BANGALORED");
	}
	
	public static String longest(String input){
		StringBuffer longest = new StringBuffer("");
	
		char[] letters = input.toCharArray();
		char[] visited = new char[128];
		int maxl=0,maxh=0;
		for(int i=0;i<letters.length;i++){
			visited[letters[i]] = 1;
			//Start from 0 scan through until u find same char. then start again
			int j=i+1;
			while(j < letters.length && visited[letters[j]] != 1){
				visited[letters[j]] = 1;
				j++;
			}
			
			//Now i & j are non unique
			if(j-i > maxh-maxl){
				maxl = i; maxh = j;
			}
			
			
			i = j;
			
		}
		
		for(int k=maxl;k<maxh;k++){
			System.out.print(letters[k]);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		return longest.toString();
	}
	
	
	
	
	static void longest2(String str){
		int[] visited = new int[256];
		int curLen = 1, maxLen = 1;
		int prevIndex = -1;
		StringBuffer  res = new StringBuffer("");
		StringBuffer finalRes = new StringBuffer("");
		
		for(int i=0; i<256;i++){
			visited[i]=-1;
		}
		//char[] letters = 
		visited[str.charAt(0)] = 0;
		res.append(str.charAt(0));
		
		
		for(int i=1; i<str.length();i++){
			prevIndex = visited[str.charAt(i)];
			
			//If char not yet visited or is not in the currently considered substring consider it
			if(prevIndex == -1 || i - curLen > prevIndex){
				curLen++;
				res.append(str.charAt(i));
			}else{
				if(curLen > maxLen){
					maxLen = curLen;
					finalRes = res;
				}
				
				 curLen = i-prevIndex;
				 res = new StringBuffer(str.substring(prevIndex+1, i+1));
						 
			}
			
			visited[str.charAt(i)]  = i;
		}
		
		if(curLen > maxLen){
			maxLen = curLen;
			finalRes = res;
		}
		System.out.println(finalRes);
	}
}
