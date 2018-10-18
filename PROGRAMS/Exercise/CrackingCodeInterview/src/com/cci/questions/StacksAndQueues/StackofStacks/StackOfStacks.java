package com.cci.questions.StacksAndQueues.StackofStacks;

import java.util.ArrayList;

public class StackOfStacks {
	
	ArrayList<Stack> stacks = new ArrayList<Stack>();
	
	public void push(int v){
		Stack last =  getLastStack();
		if(last != null && !last.isAtCapacity()){
			last.push(v);
		}else{
			Stack stack = new Stack(5);
			stack.push(v);
			stacks.add(stack);
		}
	}
	
	public int pop(){
		Stack last = getLastStack();
		int v = last.pop();
		if(last.size == 0){
			stacks.remove(stacks.size()-1);			
		}
		return v;
	}
	
	public Stack getLastStack(){
		if(stacks.size() == 0){
			return null;
		}
		return stacks.get(stacks.size()-1);
	}
	
	public int popAt(int index){
		return leftShift(index, true);
	}
	
	public int leftShift(int index, boolean removeTop){
		Stack stack = stacks.get(index);
		int removedValue = 0;
		if(removeTop){
			removedValue = stack.pop();
		}else{
			removedValue = stack.removeBottm();
		}
		
		if(stack.isEmpty()){
			stacks.remove(index);
		}else if(stacks.size() > index+1){
			int v =leftShift(index+1, false);
			stack.push(v);
		}
		return removedValue;
	}

}
