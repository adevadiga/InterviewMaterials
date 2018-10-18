package com.hackersrank.pgm;

import java.math.BigInteger;
import java.util.Scanner;

public class HallowenParty {

	public static void cutInfiniteCake(){
		Scanner in =  new Scanner(System.in);
		int noOfTestCases = in.nextInt();
		long horizontalCuts = 0l;
		long verticalCuts = 0;
		for(int i=0;i<noOfTestCases;i++){
			long noOfCuts = in.nextLong();
			verticalCuts = noOfCuts/2;
			horizontalCuts = noOfCuts - verticalCuts;
			System.out.println(verticalCuts*horizontalCuts);
			
			
		}
	}
}
