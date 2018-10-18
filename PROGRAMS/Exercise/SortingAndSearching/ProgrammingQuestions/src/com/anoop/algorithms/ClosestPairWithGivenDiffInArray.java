package com.anoop.algorithms;

import java.util.Arrays;
import java.util.HashMap;

public class ClosestPairWithGivenDiffInArray {

	static void closestPair(int[] a, int diff){
		Arrays.sort(a);
		int i=0;
		int j=1;
		for(;i<a.length&&j<a.length;){
			if(i != j && a[j] -a[i] == diff){
				System.out.println(a[i]+" "+a[j]);
			}
			if(a[j] -a[i] < diff){
				j++;
			}else{
				i++;
			}
		}
	}
	 
	static void closestPairUsingHashMap(int[] a , int diff){
		HashMap<Integer, Boolean> track = new HashMap<Integer, Boolean>();
		for(int t:a){
			track.put(t, true);
		}
		
		for(int i=0;i<a.length;i++){
			if(track.containsKey(a[i]+diff)){
		    	System.out.println("Found "+a[i]+" "+a[i]+diff);	
			}
		}
	}
	public static void main(String[] args) {
		

	}

}
