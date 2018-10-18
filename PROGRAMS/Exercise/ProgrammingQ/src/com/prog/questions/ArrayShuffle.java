package com.prog.questions;

import java.util.Arrays;
import java.util.Random;

public class ArrayShuffle {
	
	static void test(){
		int[] a  =  new int[]{1,2,3,4,5};
		System.out.println(Arrays.toString(a));
		shuffle(a);
		System.out.println(Arrays.toString(a));
		
	}

	static void shuffle(int[] a){
		
		Random rand = new Random();
		for(int i = a.length-1; i>=0; i--){
			
			int j = rand.nextInt(i+1);
			
			swap(a, i , j);
			
		}
	}
	
	static void swap(int[] a ,int i, int j){
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
}
