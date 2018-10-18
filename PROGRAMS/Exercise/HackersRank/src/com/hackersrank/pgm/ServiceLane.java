package com.hackersrank.pgm;

import java.util.Scanner;

public class ServiceLane {

	public static void findMinimumWidth(){
		
		Scanner in = new Scanner(System.in);
		int lengthOfFreeway = in.nextInt();
		int noOfTestCases = in.nextInt();
		int[] width = new int[lengthOfFreeway];
		for(int i=0;i<lengthOfFreeway;i++){
			width[i] = in.nextInt();
		}
		int enterSegment=0,exitSegement=0;
		for(int i=0;i<noOfTestCases;i++){
			enterSegment = in.nextInt();
			exitSegement = in.nextInt();
			
			//Find minimum in the subarray enterSegment to exitSegement
			int min=Integer.MAX_VALUE;
			for(int j=enterSegment;j<=exitSegement;j++){
				if(width[j] < min){
					min = width[j];
				}
			}
			System.out.println(min);
		}
		
		
	}
}
