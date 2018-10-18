package com.anoop.algorithm;

import java.util.Arrays;

public class MergeSort {

	public static void sort(int a[]){
		System.out.println("Input: ");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ,");
		}
		System.out.println("");
		mergeSort(a, 0, a.length);
		
		/*System.out.println("Output: ");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ,");
		}*/
	}
	
	public static void mergeSort(int a[], int p, int r){
		
		
		if(r-p<=1){
			return;
		}
		int q = (p+r)/2;
		int[] t =  Arrays.copyOfRange(a,p,q+1);
		//System.out.println("Recursive 1 p & q=> "+p+" "+q+"   =>"+Arrays.toString(t));
		 
		mergeSort(a, p, q);
		t =  Arrays.copyOfRange(a,q+1,r);
		System.out.println("Recursive 2 => "+Arrays.toString(t));
		mergeSort(a, q+1, r);
		System.out.println("Before merge");
		System.out.println("p "+p+ " q "+q+" r "+r);
		merge(a, p, q, r);
		
	}
	
	public static void merge(int[] a, int p, int q, int r){
		int[] t =  Arrays.copyOfRange(a,p,r);
		System.out.println("In merge.....");
		/*System.out.println(Arrays.toString(t));*/
		System.out.println(" p=>"+p+" q=>"+q+" r=>"+r);
		int n1 = q-p+1+1;
		int n2 = r-q;
		//Construct sub array
		int[] left = new int[n1];
		int[] right = new int[n2];
		
		//Copy left and right
		for(int index = 0;index<n1-1;index++){
			left[index] = a[p+index];
		}
		for(int index = 0;index<n2-1;index++){
			right[index] = a[q+1+index];
		}
		
		left[n1-1] = 100000;
		right[n2-1] = 100000;
		
		int leftArrayIndex = 0;
		int rightArrayIndex = 0;
		
		//Manipulate original array
		//System.out.println("------------");
		for(int k=p;k<r;k++){
			if(left[leftArrayIndex] <= right[rightArrayIndex]){
				a[k] = left[leftArrayIndex];
				leftArrayIndex++;
				//System.out.print(a[k]+", ");
			}else{
				a[k] = right[rightArrayIndex];
				rightArrayIndex++;
				//System.out.print(a[k]+" ,");
			}
		}
		
		
		
		
	}
	
	
}
