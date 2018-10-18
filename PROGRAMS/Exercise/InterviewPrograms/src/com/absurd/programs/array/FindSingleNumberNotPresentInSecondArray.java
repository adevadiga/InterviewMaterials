package com.absurd.programs.array;

/*
 * a=[1,2,3,4,5]
 * b=[1,2,4,5]
 */
public class FindSingleNumberNotPresentInSecondArray {

	public int findMissingNumber(int[] a, int[] b){
		
	    int firstSum=0;
	    for(int i=0;i<a.length;i++){
	    	firstSum+=a[i];
	    }
	
	    for(int i=0;i<b.length;i++){
	    	firstSum-=b[i];
	    }
	    return firstSum;
	}
}
