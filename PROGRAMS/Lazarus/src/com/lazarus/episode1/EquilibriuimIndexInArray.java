package com.lazarus.episode1;

/*
 * Given an array find an element such that sum of all elements on left equal to sum on right
 */
public class EquilibriuimIndexInArray {
	
	public static void main(String[] args){
		
	}

	public static int equilibrium(int[] a)
	{
		if(a == null) return -1;
		
		int leftSum = 0, sum = 0;
		for(int e:a){
			sum+=e;
		}
		
		for(int i=0;i<a.length;i++){
			sum -= a[i];
			if(sum == leftSum)
			{
				return i;
			}
			
			leftSum+=a[i];
		}
		return -1;
		
	}
}
