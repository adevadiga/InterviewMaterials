package com.lazarus.episode1;

public class FindDuplicatesInArray {

	public void isThereAnyDuplicates(int[] a){		
		for(int i=0;i<a.length-1;i++){
			for(int j = i+1; j<a.length;j++){
				if(a[i] == a[j]){
					System.out.println("Found duplicate");
				}
			}
		}
	}
	
	
}
