package com.absurd.programs.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateElementsFromArray {
	
	public void bruteforce(int[] a){
		List<Integer> uniqueItemFromArray = new ArrayList<Integer>();	
		for(int i = 0; i<a.length;i++){
			int j= i+1;
			for(;j<a.length;j++){
				if(a[i] == a[j]){
					break;
				}
			}
			if( j == a.length){ //If no duplicate from i+1 onwards add it
				uniqueItemFromArray.add(a[i]);
			}
		}		
       Integer[] unique = uniqueItemFromArray.toArray(new Integer[uniqueItemFromArray.size()]);
       System.out.println(Arrays.toString(unique));		
	}
	
	/*
	 * Study this
	 */
	public void remove(int[] a){
		if(a == null){
			return;
		}
		int len = a.length;
		if(len < 2){
			return;
		}
		int tail = 1;
		for(int i=1;i<len;i++){
			int j = 0;
			for(;j<tail;j++){
				if(a[i] == a[j]){
					break;
				}
			}
			if(j == tail){
				a[tail] = a[i];
				tail++;
			}
		}
		
		a[tail] = Integer.MIN_VALUE;
		/*
		 * If u want u can copy the elements from a 0 - tail to a new array
		 */
		System.out.println(Arrays.toString(a));
	}
	
	public void usingSet(int[] a){
		
		Set<Integer> setOfa = new LinkedHashSet<Integer>();		
		for(int i : a){
			setOfa.add(i);
		}
		Integer[] u = setOfa.toArray(new Integer[setOfa.size()]);
		System.out.println(Arrays.toString(u));
		
	}
	
	
}
