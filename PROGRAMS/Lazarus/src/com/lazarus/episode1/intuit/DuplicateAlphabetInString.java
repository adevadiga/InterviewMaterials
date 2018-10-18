package com.lazarus.episode1.intuit;

public class DuplicateAlphabetInString {

	static void findDuplicates(String word)
	{
		char[] hit = new char[256];
		char[] letters = word.toCharArray();
		for(char c:letters)
		{			
			hit[c]++;
		}
		for(int i=0;i<256;i++)
		{		
			if(hit[i] > 1)
			{
				System.out.printf("%c",i);
			}
		}
	}
	public static void main(String[] args) {
		
		findDuplicates("anoop");
	}

}
