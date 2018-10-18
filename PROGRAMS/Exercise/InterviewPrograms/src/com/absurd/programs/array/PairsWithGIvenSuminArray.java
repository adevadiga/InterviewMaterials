package com.absurd.programs.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PairsWithGIvenSuminArray {
	public static void test(){
		int[] a= new int[]{7 ,6 ,23,19,10,11,9,3,5};
		findPairsWithGivenSum(a, 16);
		
	}
	
	/*
	 * Need sort
	 */
	public static void findPairsWithGivenSum(int[] a, int sum){
		Arrays.sort(a); //Sort first
		int i=0;
		int j=a.length-1;
		while(i<j){
			if(a[i]+a[j] == sum){
				System.out.println(a[i]+" + "+a[j]);
			}
			if(a[i]+a[j] > sum){
			    j--;	
			}else{
				i++;
			}
		}	
	}
	/*
	 * Using a HashTable
	 */
	public static void findPairsWithSum(int[] a, int sum){
		Map<Integer,Boolean> mapOfArray  = new HashMap<Integer,Boolean>();
		for(int elem : a){
			mapOfArray.put(elem,true);
		}
		for(int elem : a){
			if(mapOfArray.get(sum-elem) != null && mapOfArray.get(sum-elem) == true){
				System.out.println(elem+" ,"+(sum-elem));
			}
		}
	}
	
}
