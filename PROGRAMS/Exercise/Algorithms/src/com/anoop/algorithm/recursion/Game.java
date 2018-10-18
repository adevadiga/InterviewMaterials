package com.anoop.algorithm.recursion;

public class Game {

	static int NO_GOOD_MOVE = -1;
	int findGoodMove(int nCoins)
	{
		for(int nTaken = 1;nTaken<=3; nTaken++){
			if(isBadPosition(nCoins-nTaken)){
				return nTaken;
			}			
		}
		return NO_GOOD_MOVE;
	}
	
	boolean isBadPosition(int nCoins){
		if(nCoins == 1){
			return true;
		}
		return findGoodMove(nCoins) == NO_GOOD_MOVE;
	}
}
