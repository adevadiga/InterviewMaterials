package com.algorithm.general.puzzle;

public class GenerateBinaryCode {

	static void binaryCode(int nBits){
		binaryCode(nBits,"");
	}
	static void binaryCode(int nBits, String prefix){
		if(nBits == 0){
			System.out.println(prefix);
		}else{
			binaryCode(nBits-1,prefix+"0");
			binaryCode(nBits-1,prefix+"1");
		}
	}
	public static void main(String[] args){
		binaryCode(3);
	}
}
