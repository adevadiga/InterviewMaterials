package com.absurd.programs.sorting;

public class QuickSort {

	public void quickSort(int[] a){
		quickSort(a, 0, a.length-1);
	}
	
	public void quickSort(int[] a, int low, int high){
		if(low < high){
			int partitionIndex = partition(a, low, high);
			quickSort(a, low, partitionIndex-1);
			quickSort(a, partitionIndex+1, high);
		}
	}
	
	/*public int partition(int[] a, int low, int high){
		int pivotIndex = low;
		int pivotValue = a[pivotIndex];
		swap(a, pivotIndex,high); //Swap pivot to high
		int storeIndex = 0;
		for(int i=low;i<high;i++){
			if(a[i] < pivotValue){
			  a[storeIndex] = a[i];	
			  storeIndex++;
			}			
		}
		
		//Swap storeIndex with high, pivot to its correct position
		swap(a, storeIndex, high);
		return storeIndex;		
	}*/
	public int remdomizedPartition(int[] a, int low, int high){
		int r = (int)Math.random()*(high-low+1)+low;
		swap(a, r, high);
		return partition(a, low, high);
	}
	public int partition(int[] a, int low, int high){
		int pivot = a[high];
		int i=low;
		int j=low;
		
		while(j < high){
			if(a[j] < pivot){
				swap(a, i , j);
				i++;
			}
			j++;
		}
		swap(a, i, high);
		return i;
	}
	
	private void swap(int[] a, int i, int j){
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
}
