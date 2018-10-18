package com.company.jpmorgan;

public class WorstSpirallyPrintNCrossNMatrix {

	/*
	 * Spirally print
	 */
	static void spiralPrint(int[][] a,int n){
	
		for(int iter = 0; iter<n/2;iter++){
			int i=iter, j=iter;
			while(j < (n-iter)){
				System.out.print(a[i][j]+" ");
				j++;
			}
			j--;
			i++;
			while(i< (n-iter)){
				System.out.print(a[i][j]+" ");
				i++;
			}
			i--;
		    j--;
			while(j>(0+iter)){
				System.out.print(a[i][j]+" ");
				j--;
			}
			while(i> (0+iter)){
				System.out.print(a[i][j]+" ");
				i--;
			}
		}
	}
	
	static void spiralMatrix(int[][] a, int rows, int cols){
		int currentLevel = 0;
		int min = rows > cols?cols:rows;
		while(currentLevel <= min/2){
			for(int j = currentLevel;j<cols-currentLevel-1;j++){
				System.out.print(a[currentLevel][j]+" ");
			}
			for(int i = cols+currentLevel; i<rows-currentLevel-1;i++){
				System.out.println(a[cols-currentLevel-1][i]+" ");
			}
			for(int j=cols-currentLevel-1;j>currentLevel;j--){
				System.out.println(a[rows-currentLevel-1][j]+" ");
			}
			for(int i=rows-currentLevel-1; i> currentLevel;i--){
				System.out.println(a[i][currentLevel]+" ");
			}
		}
		
	}
	
	
	
	
	/*static void printMatrixNonRecursive(int array[][], int rows, int cols){
	    int nCurrentLevel = 0;
	    int min = (rows < cols) ? rows:cols;
	    
	    while(nCurrentLevel <= min/2){
	        for(int j = nCurrentLevel; j < cols - nCurrentLevel - 1; j++){
	            System.out.print(array[nCurrentLevel][j] + " ");
	        }
	        for(int i = nCurrentLevel; i < rows - nCurrentLevel - 1; i++) {
	            System.out.print(array[i][cols - nCurrentLevel - 1] + " ");
	        }
	        for(int j = cols - nCurrentLevel - 1; j > nCurrentLevel; j--){
	            System.out.print(array[rows - nCurrentLevel - 1][j] + " ");
	        }
	        for(int i = rows - nCurrentLevel - 1; i > nCurrentLevel; i-- ){
	            System.out.print(array[i][nCurrentLevel] + " ");
	        }
	        nCurrentLevel++;
	    }
	}
*/


	
	public static void main(String[] args){
		int [][] a  = {
				{1,2,3,4},
				{12,13,14,5},
				{11,16,15,6},
				{10,9,8,7}
		};
		//spiralPrint(a,4);
		//printMatrixNonRecursive(a,4,4);
	}
}
