package com.algorithm.arraybased;

public class FindMajorityElement {

	/*
	 * only works if the one element has majority in the array.
	 * Occurs more that 1/2. Atleast two element should be consecutive
	 */
	static void findMajority(int[] a){
		int term = a[0];
		int count = 1;
		int total = 0;
		
		for(int i=1;i<a.length;i++){
			if(a[i] == term){
				count++;
			}else{
				count--;
			}
			if(count == 0){
				term = a[i];
				count = 1;
			}
		}
		//Still we don't have count, we only have term
		for(int i=0;i<a.length;i++){
			if(a[i] == term){
				total++;
			}
		}
		System.out.println("term "+term+" total "+total);
	}
	
	public static void main(String[] args){
		int[] a = {1,2,4,1,6,7,1,9,1,2,5,2,7,2,3};
		findMajority(a);
	}
}
