package com.absurd.programs.sorting;

public class BinarySearch {
	
	public int search(int[] a, int key){
		return search(a, key, 0, a.length-1);
	}

	public int search(int[] a, int key, int low, int high){
		if(low <= high){
			int mid = low + (high-low)/2;
			if(key == a[mid]){
				return mid;
			}
			
			return key < a[mid]?search(a, key, low, mid-1):search(a, key, mid+1, high);
		}
		return -1;
	}
}
