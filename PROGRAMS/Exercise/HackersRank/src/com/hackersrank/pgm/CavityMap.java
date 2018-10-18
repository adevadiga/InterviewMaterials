package com.hackersrank.pgm;

import java.util.Scanner;

public class CavityMap {

	public static void findCavity(){
		Scanner in =  new Scanner(System.in);
		int squareMapSize = in.nextInt();
		int[][] squareMap = new int[squareMapSize][squareMapSize];
		for(int i=0;i<squareMapSize;i++){
			int mapValue = in.nextInt();
			int j=3;
			while(mapValue !=0){
				squareMap[i][j--] = mapValue%10;
				mapValue /= 10;
			}
			
		}
		
		printCavity(squareMap, squareMapSize);
	}
	
	private static void printCavity(int[][] squareMap, int size){
		
		//int i = 1;
		//int j = 1;
		int[][] cavityMap = new int[size][size];
		
		for(int i=1;i<size-1;i++){
			for(int j=1;j<size-1;j++){
				
				int elem = squareMap[i][j];
				
				if(cavityMap[i-1][j] == 1){
					i++;
					continue;
				}
				
				if(elem > squareMap[i-1][j] && elem > squareMap[i][j-1] && elem > squareMap[i][j+1] && elem >squareMap[i+1][j]){
					cavityMap[i][j] = 1;
					i++;
					continue;
				}
				
			}
		}
		/*while(i < size && j < size){
			int elem = squareMap[i][j];
			if(cavityMap[i-1][j] == 1){
				j++;
				continue;
			}
			if(elem > squareMap[i-1][j] && elem > squareMap[i][j-1] && elem > squareMap[i][j+1] && elem >squareMap[i+1][j]){
				cavityMap[i][j] = 1;
				i++;
				continue;
			}
			
			i++;j++;
		}*/
		
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				if(cavityMap[i][j] == 1){
					System.out.print("X");
				}else{
					System.out.print(squareMap[i][j]);
				}
			}
		System.out.println();
		}
		
		
		
	}
}
