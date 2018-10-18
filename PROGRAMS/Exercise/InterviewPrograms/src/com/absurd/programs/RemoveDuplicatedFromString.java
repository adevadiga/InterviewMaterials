package com.absurd.programs;

public class RemoveDuplicatedFromString {

	public static void removeDuplicates(char[] a){
		
		boolean[] hit = new boolean[256];
		for(int i=0;i<256;i++){
			hit[i]=false;
		}
		hit[a[0]] = true;
		int tail = 1;
		for(int i =1; i<a.length;i++){
			if(!hit[a[i]]){
				a[tail] = a[i];
				tail++;
				hit[a[i]] = true;
			}
			
		}
		
	}
}
