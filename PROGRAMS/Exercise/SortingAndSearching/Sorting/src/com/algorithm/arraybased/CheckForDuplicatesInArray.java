package com.algorithm.arraybased;

public class CheckForDuplicatesInArray {

	/*
	 * brute force O(n2)
	 */
	static boolean checkDuplicates(int[] a){
		boolean hasDuplicates = false;
		for(int i=0;i<a.length-1;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i] == a[j]){
					hasDuplicates = true;
					break;
				}
			}
			if(hasDuplicates){
				break;
			}
		}
		
		return hasDuplicates;
	}
	/*
	 * Use set when add is called returns false.
	 */
	static void check(int[] a){
		
		
	}
	
	
}
