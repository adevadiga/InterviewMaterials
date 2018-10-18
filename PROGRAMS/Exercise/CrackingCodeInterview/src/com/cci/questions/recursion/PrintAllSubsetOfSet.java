package com.cci.questions.recursion;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSubsetOfSet {

	public ArrayList<ArrayList<Integer>> getSubSets(ArrayList<Integer> set, int index){
		ArrayList<ArrayList<Integer>> allSubSets = new ArrayList<ArrayList<Integer>>();
		
		if(set.size() == index){
			allSubSets = new ArrayList<ArrayList<Integer>>();
			allSubSets.add(new ArrayList<Integer>()); // Empty set
		}else{
			allSubSets = getSubSets(set, index+1);
			Integer item = set.get(index);
			
			ArrayList<ArrayList<Integer>> moreSubSets = new ArrayList<ArrayList<Integer>>();
			for(ArrayList<Integer> subSets : allSubSets){
				ArrayList<Integer> newSubSets = new ArrayList<Integer>();
				newSubSets.addAll(subSets);
				newSubSets.add(item);
				
				moreSubSets.add(newSubSets);
			}
			allSubSets.addAll(moreSubSets);
		}
		
		
		return allSubSets;
	}
}
