package com.hackersrank.pgm;

import java.util.Arrays;
import java.util.Scanner;

public class CutTheSticks {

	public static void noOfCuts(int[] a)
	{
		int n = a.length;
		Arrays.sort(a);
		System.out.println(n);
		for(int i=0;i<n-1;i++){
			while(a[i] == a[i+1]){
				i++;
			}
			System.out.println(n-(i+1));
		}
		
	}
	
	public static void test(){
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		
		int[] a = new int[size];
		in.nextLine();
		for(int i=0;i<size;i++){
			a[i] = in.nextInt();
		}
		noOfCuts(a);
	}
}

