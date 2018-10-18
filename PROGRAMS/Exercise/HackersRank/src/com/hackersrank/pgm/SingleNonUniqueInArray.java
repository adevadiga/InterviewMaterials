package com.hackersrank.pgm;

import java.util.Scanner;

public class SingleNonUniqueInArray {

	public static int findLonelyInteger(int[] a)
	{
		int xor = 0;
		for(int i=0; i<a.length;i++){
			xor ^= a[i];
		}
		return xor;
	}
	public static void test(){
		Scanner in = new Scanner(System.in);
		int size = in.nextInt();
		if(size%2 == 0){
			System.out.println("It cannot be");
			System.exit(0);
		}
		int[] a = new int[size];
		in.nextLine();
		for(int i=0;i<size;i++){
			a[i] = in.nextInt();
		}
		System.out.println(findLonelyInteger(a));
	}
}
