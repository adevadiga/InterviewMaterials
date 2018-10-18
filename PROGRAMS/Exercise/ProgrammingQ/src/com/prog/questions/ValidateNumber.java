package com.prog.questions;

import java.text.DecimalFormat;

public class ValidateNumber {

	public static void test(){
		String num = "12345670.56899";
		String regex = "[1-9]\\d{1,8}+([.]\\d{1,4})?";
		if(num.matches(regex)){
			System.out.println("Valid");
		}else{
			System.out.println("Not  Valid");
		}
		
		DecimalFormat f = new DecimalFormat();
	}
}
