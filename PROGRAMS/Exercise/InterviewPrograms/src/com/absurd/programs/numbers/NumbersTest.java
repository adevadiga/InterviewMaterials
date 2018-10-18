package com.absurd.programs.numbers;

import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;

public class NumbersTest {
	
	Numbers object;
	@Before
	public void setUp(){
		object = new Numbers();
	}

	@Test
	public void testIsPowerOftwo(){
           Assert.assertEquals(true, object.isPowerOfTwo(32));	
           Assert.assertEquals(false, object.isPowerOfTwo(33));
	}
	
	@Test
	public void testPalindrome(){
		  Assert.assertEquals(true, object.isPalindrome(1221));	
		  Assert.assertEquals(false, object.isPalindrome(567));	
	}
	@Test
	public void testNthFibonacciAdditive(){
		Assert.assertEquals(34, object.nthFibonacciAdditive(10, 0, 1));
	}
}
