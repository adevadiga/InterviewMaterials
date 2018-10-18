package com.lazarus.episode1;

public class StrictlyIncreasingSubArrays {

	public static  void find(int[] a){
		int count = 0;
		for(int i=0;i<a.length;i++){
			
			for(int j=i+1; j<a.length;j++){
				if(a[j] > a[j-1]){
					count++;
				}else{
					break;
				}
			}
				
		}
		System.out.println(count);
	}
	 public static void  main(String[] args) {
		 int[] a = {1, 2, 3, 4};		 
        find(a);
       int[] b = {1, 2, 2, 4};
       find(b);
	}
}
