package com.hackersrank.pgm;

import java.util.Scanner;

public class ConvertToPalindrome {
	
	public static int findRotation(String str){
		char[] strAsChar = str.toCharArray();
		int rotation = 0;
		for(int i=0,j=strAsChar.length-1;i<j;i++,j--){
			if(strAsChar[i] != strAsChar[j]){
				rotation += Math.abs(strAsChar[i]-strAsChar[j]);
			}
		}
		return rotation;
	}

	public static void findtheRotataion(){
		Scanner in = new Scanner(System.in);
		int noOftestCases = in.nextInt();
		in.nextLine();
		//System.out.println("Input: "+noOftestCases);
		for(int i=0;i<noOftestCases;i++){
			String text = in.nextLine();
			//System.out.println("Text is "+text);
			System.out.println(findRotation(text));
		}
	}
}
