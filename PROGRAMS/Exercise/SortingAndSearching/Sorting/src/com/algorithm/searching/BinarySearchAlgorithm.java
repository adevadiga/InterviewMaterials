package com.algorithm.searching;

public class BinarySearchAlgorithm {

	public static int binarySearch(int[] a, int key){
		return binarySearch(a, key,0,a.length-1);
	}
	static int binarySearch(int[] a, int key, int l, int r){
		if(l <= r){
			int mid = l + (r-l)/2;
			if(a[mid] == key)
				return mid;
			else 
				{
				  if(a[mid] > key)
				 	return  binarySearch(a, key, l, mid-1);
				  else
					return  binarySearch(a, key, mid+1, r);
				}
		}
		
		return -1;
	}
	
	public static void main(String[] args){
		int[] a = {10,20,30,40,50,60,70,80,90};
		int index = BinarySearchAlgorithm.binarySearch(a, 90);
		System.out.println(index);
		index = BinarySearchAlgorithm.binarySearch(a, 12);
		System.out.println(index);
	}
}
