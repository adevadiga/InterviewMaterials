package com.cci.questions;

public class SetZeroesInMatrix {

	public static void setZeroes(int[][] matrix){
		int[] row = new int[matrix.length];
		int[] column = new int[matrix[0].length];
		
		for(int r=0;r<matrix.length;r++){
			for(int c=0;c<matrix[0].length;c++){
				if(matrix[r][c] == 0){
					row[r] = 0;
					column[c] = 0;
				}
			}
		}
		
		for(int r=0;r<matrix.length;r++){
			for(int c=0;c<matrix[0].length;c++){
				if(row[r] == 1 || column[c] == 1){
					matrix[r][c] = 0;
				}
				
			}
		}
	}
}
