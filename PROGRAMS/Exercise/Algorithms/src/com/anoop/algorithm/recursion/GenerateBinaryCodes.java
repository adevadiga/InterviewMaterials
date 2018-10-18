package com.anoop.algorithm.recursion;

public class GenerateBinaryCodes {

	public static void binaryCode(int nBits){
		generateBinaryCode(3, "");
	}
	
	static void generateBinaryCode(int nBits, String prefix){
		//System.out.println(prefix);
		if(nBits == 0){
			System.out.println(prefix);
		}else{
			generateBinaryCode(nBits-1, prefix+"0");
			generateBinaryCode(nBits-1, prefix+"1");
		}
		
	}
}
