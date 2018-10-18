package com.prog.questions;

public class ClosestPairInSortedArrayWithSum {
	
	public static void test(){
		int[] a={1, 4, 5, 7};
		int[] b={10, 20, 30, 40};
		int x = 30;
		findClosestPair(a, b, x);
	}
	
	/*
	 * Two sorted array
	 */
	
	static void findColosetPair(int[] a, int[] b, int sum){
		
		int minDiff = Integer.MAX_VALUE;
		int l = 0;
		int r = b.length-1;
		int length_A = a.length;
		int length_B = b.length;
		int indexA = -1;
		int indexB = -1;
		
		while(l<length_A && r>=0){
			
			if(Math.abs(a[l]+b[r]-sum) < minDiff){
				minDiff = Math.abs(a[l]+b[r]-sum);
				indexA = l;
				indexB =  r;
			}
			
			if(a[l]+a[r] > sum){
				r--;
			}else{
				l++;
			}
		}
		
		System.out.println("Index in first array "+indexA+" Second "+indexB);
	}

	static void findClosestPair(int[] a, int[] b, int x){
		int minDiff = Integer.MAX_VALUE;
		int aElem=-1,bElem=-1;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<b.length;j++){
				System.out.println(Math.abs(a[i]+b[j]-x));
				if( Math.abs(a[i]+b[j]-x) < minDiff ){
					minDiff = Math.abs(a[i]+b[j]-x);
					aElem = a[i];
					bElem = b[j];
				}
			}
		}
		
		System.out.println("Answer is: "+aElem+" ,"+bElem);
	}
}
