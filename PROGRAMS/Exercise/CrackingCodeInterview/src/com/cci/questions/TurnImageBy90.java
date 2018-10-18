package com.cci.questions;

public class TurnImageBy90 {
	public static void printImage(int[][] image, int r, int c){
		for(int i=0;i<r;i++){
			for(int j=0;j<c;j++){
				System.out.print(image[i][j]+"    ");
			}
			System.out.println();
		}
	}
	public static void turnImageBy90Degree(){
		int[][] image = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
		int[][] rotataedImage = new int[4][3];
	    int m=3,n=4;
		printImage(image, m, n);
		
		for(int r=0;r<m;r++){
			for(int c=0;c<n;c++){
				
				rotataedImage[c][m-1-r] = image[r][c];
			}
		}
		System.out.println("Rotated........");
		printImage(rotataedImage, n, m);
		
	}

}
