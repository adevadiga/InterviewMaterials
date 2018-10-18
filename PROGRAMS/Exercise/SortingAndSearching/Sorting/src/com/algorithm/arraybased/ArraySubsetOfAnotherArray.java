package com.algorithm.arraybased;

import com.algorithm.searching.BinarySearchAlgorithm;
import com.algorithm.sorting.QuickSortAlgorithm;

public class ArraySubsetOfAnotherArray {

	static boolean isSubset(int[] a1, int[] a2){
		boolean isSubset = true;
		
		QuickSortAlgorithm.quickSort(a1);
		for(int e:a2){
			int i = BinarySearchAlgorithm.binarySearch(a1, e);
			if(i == -1)
			{
				isSubset = false;
				break;
			}
		}
		
		return isSubset;
	}
}
