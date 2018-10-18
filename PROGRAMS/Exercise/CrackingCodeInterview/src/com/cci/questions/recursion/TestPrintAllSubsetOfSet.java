package com.cci.questions.recursion;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class TestPrintAllSubsetOfSet {

	@Test
	public void testGetSubSets(){
		ArrayList<Integer> set = new ArrayList<Integer>();
		set.add(1);set.add(2);set.add(3);
		ArrayList<ArrayList<Integer>> allSubSets = new PrintAllSubsetOfSet().getSubSets(set, 0);
		for(ArrayList<Integer> subSet:allSubSets){
		   System.out.println(subSet.toString());
		}
	}
}
