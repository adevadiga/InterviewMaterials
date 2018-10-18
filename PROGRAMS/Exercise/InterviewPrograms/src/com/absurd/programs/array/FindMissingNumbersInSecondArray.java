package com.absurd.programs.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * Few numbers are not present in second array. Find them
 */
public class FindMissingNumbersInSecondArray {
	
	public Integer[] findMissingNumbers(int[] a , int[] b){
		List<Integer> missingNumbers = new ArrayList<Integer>();
		Set<Integer> setOfSecondArray = new HashSet<Integer>();
		int missedNumberCount = 0;
		
		//Add second array to set
		for(int i=0;i<b.length;i++){
			setOfSecondArray.add(b[i]);
		}
		for(int i=0;i<a.length;i++){
			//Add second array. 
			//If successfully added that means these numbers are missed in second array
			if(setOfSecondArray.add(a[i])){
				missingNumbers.add(a[i]);
				missedNumberCount++;
			}
			
		}
		
		return missingNumbers.toArray(new Integer[missedNumberCount]);
		
	}
	
  
}
