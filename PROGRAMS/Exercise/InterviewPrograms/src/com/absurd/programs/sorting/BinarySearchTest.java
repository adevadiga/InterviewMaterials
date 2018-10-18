package com.absurd.programs.sorting;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {

	@Test
	public void searchTest(){
		BinarySearch bSearch = new BinarySearch();
		int[] a= {1,2,3,4,5,6,7,8,9,10};
		//Assert.assertEquals(1, bSearch.search(a, 2));
		//Assert.assertEquals(5, bSearch.search(a, 6));
		Assert.assertEquals(9, bSearch.search(a, 10));
		//Assert.assertEquals(-1, bSearch.search(a, 12));
	}
}
