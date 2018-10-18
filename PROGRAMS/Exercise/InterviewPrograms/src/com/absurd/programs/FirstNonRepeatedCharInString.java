package com.absurd.programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FirstNonRepeatedCharInString {

	public static  void firstNonRepeate(String str){
		List<Character> repeating = new ArrayList<Character>();
		List<Character> nonRepeating = new ArrayList<Character>();
		char[] strChar = str.toCharArray();
		for(Character ch: strChar){ //Should be Character else it will treat as int
			if(repeating.contains(ch)){
				continue;
			}else if(nonRepeating.contains(ch)){
				nonRepeating.remove(ch);
				repeating.add(ch);
			}else{
				nonRepeating.add(ch);
			}
		}
		
		System.out.println(nonRepeating.get(0));
	}
	
	public static void nonRepeatCharHashTable(String str){
		
		Map<Character, Integer> charCount = new HashMap<Character, Integer>();
		char[] strchr = str.toCharArray();
		for(char c: strchr){
			charCount.put(c, charCount.get(c)==null?1:charCount.get(c)+1);
		}
		for(char c: strchr){
			if(charCount.get(c) == 1){
				System.out.println(c);
				break;
			}
		}
		/*Using int array. Note that you need to loop through string twice*/
		int[] count = new int[256];
		for(char c: strchr){
			count[c]++;
		}
		for(char c: strchr){
			if(count[c] == 1){
				System.out.println(c);
				break;
			}
		}
	}
}
