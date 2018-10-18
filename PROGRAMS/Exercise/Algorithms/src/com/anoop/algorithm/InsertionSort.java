package com.anoop.algorithm;

public class InsertionSort {

	public static void sort(int[] a){
		
		System.out.println("Input: ");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ,");
		}
		int noOfElem = a.length;
		for(int j=1;j<noOfElem;j++){
			int i=j-1;
			int key=a[j];
			
			while(i>=0 && a[i] > key){
			  a[i+1] = a[i];
			  i--;
			}
			a[i+1]=key;
		}
		System.out.println("Output: ");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ,");
		}
	}
}
