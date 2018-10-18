package com.cci.questions.linkedlist;

public class Node {
	public Integer data;
	public Node next;
	Node(Integer data){
		this.data = data;
		this.next = null;
	}
	
	public void appendToTail(Integer d){
		Node node = new Node(d);
		Node n = this;
		while(n != null){
			n = n.next;
		}
		n.next = node;
	}

}
