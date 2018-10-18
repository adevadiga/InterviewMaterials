package com.anoop.algorithm.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeyPad {

	public static void mnemonics(){
		new KeyPad().recursiveMnemonics("", "123");
	}
   
   void recursiveMnemonics(String prefix, String rest){
    	if(rest.length() == 0){
    		System.out.println(prefix);
    	}else{
	    	String[] options = returnDigits(rest.charAt(0));
	    	for(String option : options){
	    		//prefix += option; --Wrong,comment it
	    		recursiveMnemonics(prefix+option, rest.substring(1));
	    	}
    	}
    }
   
   String[] returnDigits(char ch){
	   switch(ch){	   
		   case '1':return new String[]{"A","B","C"};
		   case '2':return new String[]{"D","E","F"};
		   case '3':return new String[]{"G","H","I"};
		   default: return new String[]{};
	   }
	   
   }
}
