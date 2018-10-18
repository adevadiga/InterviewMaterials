package com.vishram.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Schuffle {
	
	static void schuffle(int[] a){
		Random rand = new Random();
		for(int i=a.length-1;i>0;i--){
			int j = rand.nextInt(i);
			swap(a, i ,j);
		}
	}
	static void schuffle(List<Integer> a){
		Random rand = new Random();
		for(int i = a.size();i>1;i--){
			int j = rand.nextInt(i);
			swap(a,i-1,j);
		}
	}

	static void swap(int[] a, int i, int j){
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	static void swap(List<Integer> a, int i, int j){
		int t = a.get(i);
		a.set(i, a.get(j));
		a.set(j, t);
	}
	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		schuffle(a);
		List<Integer> l = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
		System.out.println(Arrays.toString(a));
		System.out.println(l);

	}

}
