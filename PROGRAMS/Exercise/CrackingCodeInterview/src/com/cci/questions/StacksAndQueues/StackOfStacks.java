package com.cci.questions.StacksAndQueues;

import java.util.ArrayList;
import java.util.Stack;

public class StackOfStacks {
	
	ArrayList<Stack<Integer>> stacks =  new ArrayList<Stack<Integer>>();
	private Integer CAPACITY = 2;
	
	public void push(int item){
		Stack<Integer> last = getLastStack();
		if(last != null && last.capacity() < CAPACITY ){
			last.push(item);
		}else{
			Stack stack = new Stack();
			stack.push(item);
			stacks.add(stack);
		}
	}
	
	public Integer pop(){
		Stack<Integer> last = getLastStack();
		int item = last.pop();
		if(last.size() == 0){
			stacks.remove(stacks.size()-1);
		}
		
		return item;
	}
	private Stack getLastStack(){
		if(stacks.size() == 0){
			return null;
		}
		return stacks.get(stacks.size()-1);
	}

}
