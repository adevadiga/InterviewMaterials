package com.anoop.algorithm.recursion;

public class ToweOfHonai {

	public static void moveHoneyTower(){
		moveTower(3, 'A','B','C');
		System.out.println(moveTowerStepCount(3));
	}
	static void moveTower(int n, char start, char end, char temp){
		if(n == 1){
		    //move single disk from start to end
			moveTo(start, end);
		}else{
			//move tower of size of n-1 disk set from start to temp
			//move nth disk from start to end
			//move tower of size of n-1 disk set from temp to end
			
			moveTower(n-1, start, temp, end);
			moveTo(start, end);
			moveTower(n-1, temp, end, start);
		}
	}
	
	static void moveTo(char start, char end){
		System.out.println(start+ "  =>  "+end);
	}
	
	static int moveTowerStepCount(int n){
	   if(n==1){
		   return 1;
	   }else{
		   return moveTowerStepCount(n-1)+1+moveTowerStepCount(n-1);   
	   }
		
	}
}
