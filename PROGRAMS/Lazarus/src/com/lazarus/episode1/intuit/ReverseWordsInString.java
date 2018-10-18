package com.lazarus.episode1.intuit;

/*
 *  Let the input string be “i like this program very much”. 
 *  The function should change the string to “much very program this like i”
 */
public class ReverseWordsInString {

	static String reversewordsInString(String sentence){
		StringBuffer reverse = new StringBuffer();
		String[] words = sentence.split("[ \t]+");
		int size = words.length;
		for(int i=size-1;i>=0;i--){
			reverse.append(words[i]+" ");
		}
		
		return reverse.toString();
	}
	
	/*
	 * 1. Reverse individual words within string
	 * 2. Reverse whole string
	 */
	static String perfect(String senetence){
		char[] letters = senetence.toCharArray();
		int size = senetence.length();
		int i=0;
		int wordBeginIndex = 0;
		//Step 1
		while(i < size)
		{
			//Reached end of sentence consider last word
			if(i == size-1){
				reverse(letters, wordBeginIndex, i+1);
			}else if(letters[i] == ' '){
				reverse(letters, wordBeginIndex, i);
				wordBeginIndex = i+1;
			}
			i++;
		}
		
		//System.out.println(letters);
		
		//Step 2		
		reverse(letters, 0, size);
		
		return new String(letters);
	}
	
	static String reverse(char[] letters, int start, int end)
	{
		//char[] letters = word.toCharArray();
		//int n = word.length();
		int halfLen = (end-start)/2;
		
		for(int i=start;i<start+halfLen;i++){
			char temp1 = letters[i];
			letters[i] = letters[end-1-i + start];
			letters[end-1-i + start] = temp1;
			
		}
		//System.out.println(letters);
		
		return null;
	}
	
	
	
	
	static String reverse(String word){
		char[] letters = word.toCharArray();
		int n = word.length();
		int halfLen = n/2;
		
		for(int i=0;i<halfLen;i++){
			char temp1 = letters[i];
			letters[i] = letters[n-1-i];
			letters[n-1-i] = temp1;
			
		}
		System.out.println(letters);
		
		return null;
	}
	
	
	
	
	public static void main(String[] args) {
		String sentence = "The empty world";
		//sentence = "anoop is";
		//System.out.println(sentence);
		//sentence = reversewordsInString(sentence);
		sentence = perfect(sentence);
		System.out.println(sentence);
	}

}
