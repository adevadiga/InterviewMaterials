package com.lazarus.episode1;

public class CountNumberOfZeroesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[] = {1, 0, 0, 0, 0};
       System.out.println(countZero(arr));
       
      int firstZero = countZeroBinarySearch(arr, 0, arr.length);
      
      System.out.println(arr.length-firstZero);
	}
	
	static int countZero(int[] a){
		for(int i=0;i<a.length;i++){
			if(a[i] == 0)
			{
				return a.length-i;
			}
		}
		return 0;
	}
	
	static int countZeroBinarySearch(int[] a, int l, int r){
		if(l <= r){
			int mid = (l+r)/2;
			if( (mid == 0 ||a[mid-1] ==  1) &&  a[mid] == 0){
				return mid;
			}
			else if(a[mid]==1){
				return countZeroBinarySearch(a, mid+1, r);
			}else{
				return countZeroBinarySearch(a, l,mid-1);
			}
			
		}
		return -1;
	}

}
