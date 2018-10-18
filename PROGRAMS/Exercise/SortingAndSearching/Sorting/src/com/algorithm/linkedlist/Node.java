package com.algorithm.linkedlist;

public class Node {

	int data;
	Node next;
	Node(int data){
		this.data = data;
	}
	
	public String toString(){
		return data+(null == next?"":next.toString());
	}
}
