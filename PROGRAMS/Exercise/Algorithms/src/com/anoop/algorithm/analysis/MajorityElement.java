package com.anoop.algorithm.analysis;

import java.util.Arrays;


/*
 * Moore's Voting algorithm 
 */
public class MajorityElement {

	public static void findMElement(){
		int[] a ={4, 2, 3, 2, 9,2,6,5,2};
		System.out.println(new MajorityElement().findMajorityElementy(a));
		/*
		System.out.println(Arrays.toString(a));
		int mean = 0;
		int sum=0;
		for(int number:a){
			sum+=number;
		}
		mean = sum/a.length;
		partition(a, mean, 0, a.length-1);
		System.out.println(Arrays.toString(a));*/
	}
	
	boolean findMajorityElementy(int[] a){
		if(a.length == 0){
			return false;
		}
		int length =  a.length;
		int term = a[0];
		int count = 1;
		
		for(int i=1; i<length;i++){
			if(a[i] == term){
				count++;
			}else{
				count--;
			}
			if(count == 0){
				term = a[i];
				count = 1;
			}
		}
		int total = 0;
		System.out.println("term "+term);
		for(int i=0; i<length;i++){
			if(a[i] == term){
				total++;
			}
		}
		
		if(total > length/2){
			return  true;
		}
		
		return false;
	}
	
	static void partition(int[] a, int pivot, int start,int finish)
	{
		int lh = start;
		int rh = finish;
		while(true)
		{
			while(lh<rh && a[rh] >= pivot) rh--;
			while(lh<rh && a[lh] < pivot) lh++;
			if(lh == rh){
				break;
			}
			swap(a, lh, rh);
		}
		
		System.out.println(lh);
		/*if(a[lh] < pivot){
			return start;
		}*/
		//exchange a[lh] and start
	}
	
	static void swap(int[] a, int lh, int rh){
		
		int t = a[lh];
		a[lh] = a[rh];
		a[rh] = t;
	}
}
