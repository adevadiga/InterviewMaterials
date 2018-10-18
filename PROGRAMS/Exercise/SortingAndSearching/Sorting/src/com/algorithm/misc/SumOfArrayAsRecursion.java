package com.algorithm.misc;

public class SumOfArrayAsRecursion {

	static int sumOfArray(int[] a, int currentIndex, int totalLen){
		if(currentIndex == totalLen)
			return a[totalLen];
		
		return a[currentIndex]+sumOfArray(a,currentIndex+1, (totalLen-currentIndex+1));
	}
}
