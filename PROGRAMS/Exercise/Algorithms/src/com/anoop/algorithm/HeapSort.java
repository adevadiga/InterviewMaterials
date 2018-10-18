package com.anoop.algorithm;

import java.util.Arrays;

public class HeapSort {

	public static void heapSort(int[] a){
		
		System.out.println("Input: ");
		System.out.println(Arrays.toString(a));
		new HeapSort().doHeapSort(a, a.length);
		System.out.println("Output: ");
		System.out.println(Arrays.toString(a));
	}
	
	public void doHeapSort(int[] a , int n){
		//Step 1 Hepify
		this.heapify(a, n);
		
		int end = n-1;
		while(end > 0){
			swap(end, 0, a); //Since max Heapiy zero will always conatin max element
			end -= 1; //Reduce heap size
			maxHeapify(a, 0, end); //max heafiy was altered above. Repair it
			
		}
	}
	
	public void heapify(int[] a, int n){
		//(start is assigned the index in 'a' of the last parent node)
	    //(the last element in a 0-based array is at index n-1; find the parent of that element)
		int start= (n-2)/2;
		while( start >= 0){
			maxHeapify(a, start, n-1);			
			start--;		   
		}
	}
	
	public void maxHeapify(int[] a, int startHeapifyIndex, int unsortedMaxIndex){
		
		int root = startHeapifyIndex; //Assume start is max
				
		//Root has atmost one children
		while(root*2+1 <= unsortedMaxIndex){
			int largestChildIndex = root;
			int leftChildIndex = 2*root+1;
			int rightChildIndex = 2*root+2;
			
			if(a[leftChildIndex] > a[largestChildIndex]){
				largestChildIndex = leftChildIndex;
			}
			
			if( rightChildIndex<=unsortedMaxIndex  && a[rightChildIndex] > a[largestChildIndex]){
				largestChildIndex = rightChildIndex;
			}
			
			if(largestChildIndex  != root){
			 this.swap(largestChildIndex, root, a);
				root = largestChildIndex;
				
			}else{
				return;
			}
			
		}
		
	}
	
	public void swap(int i, int j, int[] a){
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
		
	}
	
	public static void main(String[] args){
		int[] a = {3,1,9,4,6,2};
		System.out.println(Arrays.toString(a));
		HeapSort.heapSort(a);
		System.out.println(Arrays.toString(a));
	}
}
