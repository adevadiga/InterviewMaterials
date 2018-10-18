package com.absurd.programs.sorting;

import java.util.Arrays;

import org.junit.Test;

public class QuickSortTest {

	@Test
	public void testQuickSort(){
		int[] a= { -2,4,45,2,1, 89,67,34};
		System.out.println(Arrays.toString(a));
		new QuickSort().quickSort(a);
		System.out.println(Arrays.toString(a));
	}
}
