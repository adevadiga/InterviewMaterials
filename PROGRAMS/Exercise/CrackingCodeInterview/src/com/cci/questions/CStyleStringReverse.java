package com.cci.questions;

import javax.swing.text.rtf.RTFEditorKit;

public class CStyleStringReverse {

	public static String reverse(String str){
		char[] rString = new char[str.length()];
		int index = rString.length-1;
		for(int i=0;i<str.length();i++){
			rString[index--] = str.charAt(i);
		}
      return String.valueOf(rString);
	}
}
