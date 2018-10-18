package com.absurd.programs;

public class SecondHighestNumberInArray {
	public static void test(){
		int[] a = new int[]{1,4,6,23,78,16,8};
		System.out.println(findSecondMaxNumber(a));
	}

	public static int findSecondMaxNumber(int[] a){
		if(a.length < 3){
			return Integer.MIN_VALUE;
		}
		int firstMax = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++){
			if(a[i] > firstMax){
				secondMax = firstMax;
				firstMax = a[i];
			}else if(a[i] > secondMax && a[i] != firstMax ){
				secondMax = a[i];
			}			
		}
		
		return secondMax;
	}
}
