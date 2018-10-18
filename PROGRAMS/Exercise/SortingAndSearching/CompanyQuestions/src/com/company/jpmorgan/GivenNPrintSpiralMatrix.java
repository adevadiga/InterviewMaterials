package com.company.jpmorgan;

public class GivenNPrintSpiralMatrix {

	static void printNumbersSpirally(int n){
		int x = 0, y = 0;
		int dx = 0, dy = 1;
		int count = 1;
		int[][] matrix = new int[n][n];
		
		while(count <= n*n){
			matrix[x][y] = count++;
			
			int nx = x + dx;
			int ny = y + dy;			
			//If you hit edge turn
			if(nx < 0 || nx == n || ny < 0 || ny == n ||
					matrix[nx][ny] != 0) //Already added index)
			{
				int t = dx;
		        dx = dy;
		        dy = -t;
			}
			
			x += dx;
			y += dy;
		}
		
		printMatrix(matrix);		
	}
	
	static void printMatrix(int[][] m){
		
		for(int i=0;i<m.length;i++){
			for(int j=0;j<m[0].length;j++){
				System.out.print(m[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	static void printSPiral(){
		int N = 3;
	     
	    int current = 1;
		// Start in the corner
		int x = 0, y = 0, dx = 0, dy = 1;
		int spiral[][]= new int[N][N];
		
		while (current <= N*N) {
		    // Go in a straight line
		    spiral[x][y] = current++;
		    int nx = x + dx, ny = y + dy;
		   
		    // When you hit the edge...
		    if (nx < 0 || nx == N || ny < 0 || ny == N || spiral[nx][ny] != 0) {
		        // ...turn right
		        /*int t = dy;
		        dy = dx;
		        dx = -t;*/
		    	int t = dx;
		        dx = dy;
		        dy = -t;
		    }
		    x += dx;
		    y += dy;
		}
		
		for (int i = 0; i < N; i++) {
	    	for (int j = 0; j < N; j++) {
	        	System.out.print(spiral[i][j]+"\t");
	    	}
	    	System.out.print("\n"); 
	    }
	}
	public static void main(String[] args) {
		//printSPiral();

		printNumbersSpirally(3);
	}

}
