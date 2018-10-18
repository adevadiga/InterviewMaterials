package com.absurd.programs.array;

/*
 * 1. In an array 1-100 exactly one number is duplicate how do you find it?
 * 2. In an array 1-100 multiple numbers are duplicates, how do you find it? 
 */
public class FindRepeatingElementInArray {
	public static void testMe(){
		int[] a = new int[]{1,2,3,4,5,6,7,8,4,9};
		findRepeating(a);
	}

	public static void findRepeating(int[] a){
		for(int i=0; i<a.length;i++){
			if(a[ Math.abs(a[i]) ] >=0){
				a[ Math.abs(a[i])] = -a[ Math.abs(a[i])];
			}else{
				System.out.println(Math.abs(a[i]));
			}
		}
	}
}
