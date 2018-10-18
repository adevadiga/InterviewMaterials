package com.anoop.algorithms;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.RandomAccess;

public class SchuffleElementsOfArray {

	static void schuffle(int[] a){
		Random rand = new Random(47);
		
		for(int i=a.length-1;i>=0;i--){
			int p = rand.nextInt(i+1);
			swap(a,i,p);
		}
	}
	
	static void swap(int[] a ,int i, int j){
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	static void swap(int i, int j, List<?> list){
		final List l = list;
		l.set(i,l.set(j, list.get(i)));
	}
	
	
	static void schuffleList(List<String> list){
		Random rand = new Random(47);
		if(list instanceof RandomAccess){
			for(int i=list.size()-1;i>=0;i--){
				swap(i,rand.nextInt(i),list);
			}
		}else{
			Object[] arr = list.toArray();
			for(int i=arr.length-1;i>=0;i--){
				//swap(arr, i, rand.nextInt(i+1));
			}
			//Map it back to list
			ListIterator it = list.listIterator();
			for (int i=0; i<arr.length; i++) {
                it.next();
                it.set(arr[i]);
            }
		}
	}
}
