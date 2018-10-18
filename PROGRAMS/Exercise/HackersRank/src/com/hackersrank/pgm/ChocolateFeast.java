package com.hackersrank.pgm;

import java.util.Scanner;

public class ChocolateFeast {

	public static void noOfChocs(){
		Scanner in =  new Scanner(System.in);
		int noOfTestCases = in.nextInt();
		long amount = 0l;
		long cost = 0l;
		long numberOfWrapperPerChocs = 0l;
		
		for(int i=0; i<noOfTestCases;i++){
			long totalChocs = 0;
			amount = in.nextLong();
			cost = in.nextLong();
			numberOfWrapperPerChocs = in.nextLong();
			
			totalChocs = amount/cost;
			long wrappers = totalChocs;
			while(wrappers >= numberOfWrapperPerChocs )
			{
				long noOfChocs = wrappers/numberOfWrapperPerChocs;
				totalChocs += noOfChocs;
				wrappers = noOfChocs + (wrappers % numberOfWrapperPerChocs);
			}
			
			System.out.println(totalChocs);
					
		}
	}
	
}
