package com.algorithm.arraybased;

import java.util.Arrays;

public class RemoveDuplicateFromArray {

	static void removeDuplicate(int[] a){
		int len = a.length;
		int tail = 1;
		
		for(int i=1;i<len;i++){
			int j =0;
			while(j<tail){
				if(a[j] == a[i]){
				  break;	
				}
				j++;
			}
			if(j == tail){//Not duplicate. Add it to tail
				a[tail] = a[i];
				tail++;
			}
		}
		
		int[] newA = Arrays.copyOf(a, tail);
		System.out.println(Arrays.toString(newA));
	}
	
	public static void main(String[] args) {
		int[] a ={1,4,6,12,5,12,6,8,9,15,9,4};
		System.out.println(Arrays.toString(a));
		removeDuplicate(a);

	}
}
