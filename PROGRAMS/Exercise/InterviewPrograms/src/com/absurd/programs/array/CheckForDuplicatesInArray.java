package com.absurd.programs.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CheckForDuplicatesInArray {

	public void bruteforce(int[] a){
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				if(i != j && a[i] == a[j]){
					System.out.println("Found duplicate "+a[i]);
					return;
				}
			}
		}
	}
	
	public void usingSet(int[] a){
		Set<Integer> setOfInt = new HashSet<Integer>();
		for(int i=0;i<a.length;i++){
			if(!setOfInt.add(a[i])){
				System.out.println("Found duplicate "+a[i]);
				return;
			}
		}
		
		/*List<Integer> arrayAsList = Arrays.asList(a);
		Set<Integer> set = new HashSet<Integer>(arrayAsList);
		if( set.size() != a.length){
			System.out.println("Found duplicate");
		}*/
		
	}
}
