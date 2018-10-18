package com.anoop.algorithm.recursion;

public class BinaySearch {

	public static void find(){
		int[] a ={1,2,3,4,6,89,243,678	};
		int index = binSearch(89, a, 0, a.length-1);
		System.out.println("Key at "+index);
		
	}
	static int binSearch(int key, int[] a, int low, int high){
		
		if(low > high){
			return -1;
		}
		
		int mid = (high-low)/2+low;
		if(a[mid] == key){
			return mid;
		}else if(key > a[mid]){
			return binSearch(key, a, mid+1, high);
		}else{
			return binSearch(key, a, low, mid-1);
		}
		
		
	}
}
