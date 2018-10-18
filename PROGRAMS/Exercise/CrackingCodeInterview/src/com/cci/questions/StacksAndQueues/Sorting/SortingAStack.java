package com.cci.questions.StacksAndQueues.Sorting;

import java.util.Stack;

public class SortingAStack {

	/*
	 * O(n2)
	 */
	public static Stack<Integer> sort(Stack<Integer> s){
		Stack<Integer> r = new Stack<Integer>();
		while(!s.isEmpty()){
			int t = s.pop();
			while(!r.isEmpty() && r.peek() > t){
				s.push(r.pop());
			}
			r.push(t);		
		}
		
		return r;
	}
}
