package com.algorithm.general.puzzle;

public class KeyPadImplementation {

	static void keyPad(String keys){
		keyPad("",keys);
	}
	
	static void keyPad(String prefix, String rest){
		if(rest.length() == 0){
			System.out.println(prefix);
		}else{
			String[] digits = returnDigits(rest.charAt(0));
			for(String d : digits){
				keyPad(prefix+d, rest.substring(1));
			}
		}
	}
	
	static String[] returnDigits(char ch){
		switch(ch){
		   case '1':return new String[]{"A","B","C"};
		   case '2':return new String[]{"D","E","F"};
		   case '3':return new String[]{"G","H","I"};
		   default : return new String[]{};
		}
	}
	
	public static void main(String[] args){
		keyPad("12");
	}
}
