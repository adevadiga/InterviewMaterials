package com.absurd.programs.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class RemoveDuplicateElementsFromArrayTest {
	@Test
	public void testRemove(){
		int[] a = {10,34,20,56,89,10,56,109};
		new RemoveDuplicateElementsFromArray().remove(a);
	}
	
	@Test
	public void testBruteForce(){
		int[] a = {10,34,20,56,89,10,56,109};
		new RemoveDuplicateElementsFromArray().bruteforce(a);
	}
	
	@Test
	public void testUsingSet(){
		int[] a = {10,34,20,56,89,10,56,109};
		new RemoveDuplicateElementsFromArray().usingSet(a);
	}
	
	
	
}
