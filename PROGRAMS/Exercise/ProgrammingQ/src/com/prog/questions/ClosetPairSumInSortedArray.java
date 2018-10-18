package com.prog.questions;

public class ClosetPairSumInSortedArray {
	public static void test(){
		int[] a = {10, 22, 28, 29, 30, 40};
		int sum = 54;
		closestSum(a, sum);
	}

	public static void closestSum(int[] a, int sum){
		int minDiff = Integer.MAX_VALUE;
		int l=0,r=a.length-1;
		int res_l=0,res_r=0;
		
		while(l<r){
			if(Math.abs(a[l]+a[r]-sum) < minDiff){
				minDiff = Math.abs(a[l]+a[r]-sum);	
				res_l = l;
				res_r=r;
			}
			
			if(a[l]+a[r] < sum){
				l++;
			}else{
				r--;
			}
		}
		System.out.println(res_l+" ,"+res_r);
	}
}
