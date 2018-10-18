package com.prog.questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ClosesPairWithGivenDiff {
	
	public static void test(){
		int[] a ={7 ,6 ,23,19,10,11,9,3,15};
		//findPairWithDiff(a, 4);
		findPair(a, 4);
	}
	/*
	 * HashTable
	 */
	public static  void findPairWithDiff(int[] a, int diff){
		Map<Integer,Boolean> hashTable = new HashMap<Integer,Boolean>();
		for(int i=0;i<a.length;i++){
			hashTable.put(a[i], true);
		}
		for(int i=0;i<a.length;i++){
			Boolean r = hashTable.get(a[i]+diff);
			if(r != null && r){
				System.out.println(a[i]+" "+(a[i]+diff));
			}
		}
		
	}
	/*
	 * Efficienr
	 */
	
	/*
	 *  The idea for second step is take two index variables i and j, initialize them as 0 and 1 
	 *  respectively. Now run a linear loop. If arr[j] – arr[i] is smaller than n, we need to look for greater arr[j], so increment j. If arr[j] – arr[i] is greater than n,
	 *   we need to look for greater arr[i], so increment i. Thanks
	 */
	
	static void findPair(int[] a, int diff){
		
		Arrays.sort(a);
		
		int i=0;
		int j=1;
		while(i < a.length && j < a.length){
			if(i != j && a[j]-a[i] == diff){
				System.out.println(a[i]+" "+a[j]);
			}
			if( (a[j] - a[i]) < diff){
				j++;
			}else{
				i++;
			}
		}
		
	}

}
