package com.anoop.algorithm.recursion;

public class IntegerToString {
	public static void run(){
		System.out.println(anoop(656667));
	    iterateITOA(656667);
	}
	
	static String anoop(int n){
		if(n < 10){
		   return ""+(char) (n+(char)0);		   
		}
		return anoop(n/10)+""+( (char)((n%10)) );
		
	}
	
	
	static void iterateITOA(int n){
		int asciiZero = (int)'0';
		char[] straschar = new char[50];
		int i=0;
		
		while(n > 0){
			int r = n%10;
			straschar[i++] = (char)(r+asciiZero);			
			n/=10;
		}
		
		for(char j:straschar){
			System.out.print(j+"");
		}
		String g = straschar.toString();
		System.out.println(g.toString());
	}
	
	
	

}
