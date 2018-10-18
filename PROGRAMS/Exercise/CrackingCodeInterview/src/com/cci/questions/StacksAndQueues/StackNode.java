package com.cci.questions.StacksAndQueues;

public class StackNode {

	Integer prevIndex;
	Integer data;
	public StackNode(Integer prevIndex,Integer data){
		this.prevIndex = prevIndex;
		this.data = data;
	}
	
	public String toString(){
		return data+" , "+prevIndex;
	}
}
