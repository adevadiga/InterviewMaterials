package com.lazarus.episode1;

import java.util.Arrays;

class A{
	
	void foo() throws NullPointerException{
		
	}
	
}
class B extends A{
	
void foo() throws RuntimeException{
		
	}
}
public class TripletsWithSmallerThanGivenSum {

	public static void main(String[] args){
		triplets(new int[]{1, 2},4);
		
		A[] a = new B[10];
	}
	public static void triplets(int[] a, int sum){
		
		String a1 = "test";
		String b1 = new String("test");
		 b1.intern();
		String c = new String("teaser");
		c.intern();
		System.out.println(a1==b1);
		
		Arrays.sort(a);
		int n=a.length;
		int count = 0;
		for(int i=0;i<n-2;i++){
			
			int j = i+1, k=n-1;
			while(j < k){
				
				if(a[j]+a[k] > sum){
					k--;
				}else{
					count += k-j;
					j++;
				}
			}
		}
		
		System.out.println(count);
	}
}
