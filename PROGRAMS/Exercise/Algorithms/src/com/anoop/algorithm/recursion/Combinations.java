package com.anoop.algorithm.recursion;

/*
 * Pascal triangle
 * Pascal’s Triangle has the interesting property that every entry is the sum of the two
entries above it, except along the left and right edges, where the values are always 1.
This entry, which corresponds to C(6, 2), is the sum of the two entries—5 and 10—
that appear above it to either side. Use this relationship between entries in Pascal’s
Triangle to write a recursive implementation of the Combinations function that uses
no loops, no multiplication, and no calls to Fact.

 * 
 */
public class Combinations {
	public static void findNCK(){
		System.out.println(pascal(6, 2));
	}
	
	static int pascal(int n, int k)
	{
		//System.out.println("n => "+n+" , k => "+k);
		if(k == 0 || k==n) return 1; //Left and right side always 1
		if(n == 1) return 1;   //Second row is 1 always
		return pascal(n-1, k-1)+pascal(n-1, k);
	}

}
