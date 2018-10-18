package com.company.jpmorgan;

public class SpiralPrintNbyNMatrixForN {

	public static void spiral(int n){
		int dx = 0,dy=1;
		int x=0,y=0;
		
		int counter=1;
		int[][] matrix = new int[n][n];		
		
		while(counter <= n*n){
			matrix[x][y] = counter++;
			
			int nx = x+dx;
			int ny = y+dy;
			//If you hit edge turn
			if(nx <0 || nx == n || 
			   ny <0 || ny == n ||	
			   matrix[nx][ny] != 0 //Already added at this index
			)
			{
			   int t = dx;
			   dx = dy;
			   dy = -t;
			}

			x += dx;
			y += dy;
		}
	}
}
