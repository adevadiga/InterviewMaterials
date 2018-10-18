package com.cci.questions.StacksAndQueues;

import java.util.Stack;

public class QueueUsingTwoStacks<T> {

	Stack<T> s1,s2;
	public QueueUsingTwoStacks() {
		s1 = new Stack<T>();
		s2 = new Stack<T>();
	}
	public int size(){
		return s1.size() + s2.size();
	}
	public void add(T item){
		s2.push(item);
	}
	public T peek(){
		if(!s2.isEmpty()){
			return s2.peek();
		}
		
		while(s1.isEmpty()){
			s2.push(s1.pop());
		}
		return s2.peek();
	}
	
	public T remove(){
		if(!s2.isEmpty()){
			return s2.pop();
		}
		
		while(s1.isEmpty()){
			s2.push(s1.pop());
		}
		return s2.pop();
	}
}
