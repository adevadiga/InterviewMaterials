package com.anoop.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Sort {
	public final String str;
	public Sort(String str){
		this.str=str;
	}
	public boolean equals(Object obj){
		return this.str.equals(((Sort)obj).str);
	}
	public void bubbleSort(int[] numbers) {
	    boolean numbersSwitched;
	    do {
	        numbersSwitched = false;
	        for (int i = 0; i < numbers.length - 1; i++) {
	            if (numbers[i + 1] < numbers[i]) {
	                int tmp = numbers[i + 1];
	                numbers[i + 1] = numbers[i];
	                numbers[i] = tmp;
	                numbersSwitched = true;
	            }
	        }
	    } while (numbersSwitched);
	}
	
	public void linkedListIndex(){
		List<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		list.add(300);
		
		list.remove(0);
		System.out.println(list.get(0));
		
		List<Sort> linkedList = new LinkedList<Sort>();
	
		linkedList.add(new Sort("A"));
		linkedList.add(new Sort("B"));
		linkedList.add(new Sort("C"));
		
		linkedList.remove(new Sort("A"));
		System.out.println(linkedList.get(0).str);
		
	}
	
}