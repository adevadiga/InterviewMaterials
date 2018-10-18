package com.anoop.algorithm.recursion;

public class PermuteString {

	public static void permute(){
		//permute("","ABC");
		permute2(new StringBuilder("ABA"),0);
	}
	/*
	 * if(rest is empty)  print prefix
	 * else{
	 *    for each character in rest
	 *      {
	 *         add character to prefix
	 *         remove character from rest
	 *         make recursive call to permute rest
	 *      }
	 *    
	 * }
	 * 
	 *  
	 */
	static void permute(String prefix, String rest){
		if(rest.length()<1){
			System.out.println(prefix);
		}else{
		    int l =  rest.length();
		    for(int i=0; i<l;i++){
		       // String newPrefix = prefix+rest.charAt(i);
		       // String newRest = rest.substring(0, i)+rest.substring(i+1, l);
		    	permute(prefix+rest.charAt(i), rest.substring(0, i)+rest.substring(i+1, l));
		    }
		}
	}
	/*
	 * void RecursivePermute(string prefix, string rest, Set<string> & set) {
	 *  if (rest == "") {
              set.add(prefix);
             } else {


	 * 
	 */
	
	static void permute2(StringBuilder input, int k){
		//System.out.println(index);
		if(k >= input.length()-1){
			System.out.println(input);
		}else{
			
			// Try each letter in spot j.
			for(int j=k;j<input.length();j++){
				
				// Place next letter in spot k.
				swapCharacter(j, k, input);
				
	             // Print all with spot k fixed.
				permute2(input, k+1);

	             // Put the old char back.
				swapCharacter(k, j , input);  //Backtrack here. 
				/*
				 * In the first Itration where first char("A") is fixed ---> swap(A,A)->permute (1)-->swap(B,B)->permuter(2) ->print ABC
				 * In the iteration where k=0 and j=1 (in loop) ---> move the char B to A ------>swap(A,B) and permute (AC, 2)-->here u need to backtrack and save B back to its origin po
				 * 
				 * 
				 * 
				 * 
				 */
				
			}
		}
		
	}
	
	static void swapCharacter(int i, int j, StringBuilder input){
		char t = input.charAt(i);
		input.setCharAt(i, input.charAt(j));
		input.setCharAt(j, t);
		
	}
}
