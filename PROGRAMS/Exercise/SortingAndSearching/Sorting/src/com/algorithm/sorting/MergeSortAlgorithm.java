package com.algorithm.sorting;

import java.util.Arrays;

public class MergeSortAlgorithm {
	
	public static void mergeSort(int[] a){
		mergeSort(a, 0, a.length-1);
	}
	private static void mergeSort(int[] a, int l, int r){
		if(l < r){
			int m = (l+r)/2;
			mergeSort(a, l, m);
			mergeSort(a, m+1, r);
			mergeBetter(a, l , m ,r);
		}
	}
	static void mergeBetter(int[] a, int left, int mid, int right)
	{
	   int len = mid-left+1;
	   int[] temp = new int[len];
	   for(int i=0,x = left; x<=mid;x++){
		   temp[i++] = a[x];
	   }
	   int i=0,j=mid+1,k=left;
	   while(i < len && j <=right){
		   if(temp[i] < a[j]){
			   a[k++] = temp[i++];
		   }else{
			   a[k++] = a[j++];
		   }
	   }
	   
	   while(i < len){
		   a[k++] = temp[i++];
	   }
	}
	static void merge(int[] a, int left, int mid, int right)
	{
		int leftLen = mid-left+1;
		int rightLen = right-mid;
		int[] leftPart = new int[mid-left+1];
		int[] rightPart = new int[right-mid];
		int i = left;
		int index = 0;
		while(i <= mid){
			leftPart[index++] = a[i++];
		}
		index = 0;
		i = mid+1;
		while(i <= right){
			rightPart[index++] = a[i++];
		}
		//merge to orig array
		int storeIndex = left;
		i = 0;
		int j = 0;
		while(i < leftLen && j <rightLen){
			if(leftPart[i] < rightPart[j]){
				a[storeIndex++] = leftPart[i];
				i++;
			}else{
				a[storeIndex++] = rightPart[j];
				j++;
			}
		}
		while(i<leftLen){
			a[storeIndex++] = leftPart[i++];
		}
		while(j<rightLen){
			a[storeIndex++] = rightPart[j++];
		}
		
	}
	/*
	 * As usual, you have a subscript into the left array segment (x[left]) and the right array segment (x[right]).  If x[left] tests as less than or equal to x[right], then 
	 * it is already in place within the sorted array segment, so just increment left.  Otherwise, the array element in x[right] needs to move down into the space currently
	 *  occupied by x[left], and to accommodate this, the entire array segment from x[left] through x[right-1] needs to move up by one �
	 *  effectively you need to rotate that little segment of the array.  In the process, everything moves up by one, including the end of the left segment (mid).
	 */
	static void mergeInplace(int[] a, int l, int m, int r){
		int i = l;
		int j = m+1;
		int temp;
		while(i<=m && j<=r){
			
			if(a[i] <= a[j]){
				i++;
			}else{
				temp = a[j];
				System.arraycopy(a, i, a, i+1, j-i);
				a[i] = temp;
				i++;j++;m++;
			}
			
		}
		
		
	}
	
	public static void main(String[] args){
		int[] a = {3,1,9,4,6,2};
		System.out.println(Arrays.toString(a));
		MergeSortAlgorithm.mergeSort(a);
		System.out.println(Arrays.toString(a));
	}

}
