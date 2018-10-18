package com.cci.questions.StacksAndQueues;

import java.util.Stack;

public class StatckWithMinimum2 extends Stack<Integer> {

	Stack<Integer> s2 = null;
	StatckWithMinimum2(){
		s2 = new Stack<Integer>();
	}
	
	public void push(int value){
		if(value <= min()){//= should be there
			s2.push(value);
		}
		super.push(value);
	}
	
	/*public int pop(){
		int item = super.pop();
		if(item == min()){
			s2.pop();
		}
		return item;
	}*/
	
	public int min(){
		if(s2.empty()){
			return Integer.MAX_VALUE;
		}else{
			return s2.peek();
		}
	}
}
