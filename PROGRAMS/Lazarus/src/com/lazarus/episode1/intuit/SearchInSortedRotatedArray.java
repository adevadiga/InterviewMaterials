package com.lazarus.episode1.intuit;

import javax.naming.BinaryRefAddr;

public class SearchInSortedRotatedArray {

	public static int findMinimumInRotatedSortedArray(int[] a){
		return findMinimum(a, 0, a.length-1);
	}
	
	public static int findMinimum(int[] a, int low, int high){
		//array is not rotated at all
		if(high < low) return a[0];
		
		//If there is only one element left
		if(low == high) return a[low];
		
		int mid = low+ (high-1)/2;
		
		//Consider the cases like {3, 4, 5, 1, 2}
		if(mid < high && a[mid+1] < a[mid])
			return a[mid+1];
		
		if (mid > low && a[mid] < a[mid - 1])
		       return a[mid];
		
		if(a[high] > a[mid])
			return findMinimum(a, low, mid-1);
		else 
			return findMinimum(a, mid+1, high);
	}
	public static int search(int[] a, int key){
	
		return pivotedBinarySearch(a, key);
	}
	
	static int pivotedBinarySearch(int[] a, int key)
	{
		int pivot = pivotedIndex(a, 0, a.length-1);
		if(pivot == -1)
			return binarySearch(a, 0, a.length-1, key);
		
		if(a[pivot] == key) return pivot;
		
		if(a[0] <= key)
			return binarySearch(a, 0, pivot-1, key);
		else
			return binarySearch(a,pivot+1,a.length-1, key);
		
	}
	
	static int pivotedIndex(int[] a, int low, int high){
		if(high < low) return -1;
		
		if(high == low) return low;
		
		int mid = low + (high-low)/2;
		
		if(mid < high && a[mid+1] < a[mid])
		{
			return mid;
		}
		if(mid > low && a[mid-1] > a[mid])
		{
			return mid-1;
		}
		
		if(a[low] >= a[mid])
			return pivotedIndex(a, low, mid-1);
		else
			return pivotedIndex(a, mid+1, high);
	}
	
	static int binarySearch(int[] a, int low, int high, int key){
		if(low <= high){
			int mid = low + (high-low)/2;
			if(a[mid] == key) return mid;
			return a[mid] > key?binarySearch(a, low, mid-1, key): binarySearch(a, mid+1, high, key);
		}
		return -1;
	}
	
	public static void main(String[] args){
		int[] a = {5,6,7,8,-1,2,3,4};
		/*System.out.println(findMinimumInRotatedSortedArray(a));
		int[] b ={1,2,3,4};
		System.out.println(findMinimumInRotatedSortedArray(b));
		
		System.out.println(search(a,7,0,a.length-1));
		*/
		System.out.println(search(a,3));
	}
}
