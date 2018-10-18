package com.absurd.programs.array;

/*
 * Using HashSet as done in FindMissingNumbersInSecondArray is better
 */
public class ArrayIsSubSetOfAnotherArray {

	//Approach 1
	public boolean isSubsetBruteForce(int[] a, int[] b){
		int aLen = a.length;
		int bLen = b.length;
		for(int i=0;i<aLen;i++){
			int j=0;
			for(;j<bLen;i++){
				if(a[i] == a[j]){
					break; //Found match for a[i],Continue to search for next i
				}				
			}
			
			if(j == bLen){
				return false; //No match
			}
		}
		
		return true;
	}
	//Approach 2
	//1. Sort first array
	//2. For each element of second array do binary search on first array
	//3. If all elements are found return True
	public boolean isSubsetUsingSortAndSearch(int[] a, int[] b){
		int aLength  = a.length;
		int bLength = b.length;
		//quicksort(a);
		for(int i=0;i<bLength;i++){
			//binarySearch for b[i] in a
		}
		return true;
	}
	
}
