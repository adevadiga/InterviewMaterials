package com.absurd.programs.misc;

public class SumOfArrayASRecursion {

	public int sum(int[] a){
		return sum(a, 0, a.length-1);
	}
	public int sum(int[] a , int currentIndex, int totalLen)
	{
		if(currentIndex == totalLen){
			return a[currentIndex];
		}
		
		return a[currentIndex]+sum(a,currentIndex+1, (totalLen-currentIndex+1));
	}
}
