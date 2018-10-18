package com.absurd.programs.linkedlist;

public class Node {

	Integer data;
	Node next;
	Node(Integer data){
		this.data = data;
		
	}
	
	public void appendToTail(int data){
		Node n = this;
		while(n.next != null){
			n = n.next;
		}		
		Node node = new Node(data);
		n.next = node;
	}
	
	@Override
	public String toString(){
		StringBuffer nodesText = new StringBuffer("");
		Node p = this;
		while(p != null){
			nodesText.append(p.data+ " -> ");
			p = p.next;
		}
		return nodesText.toString();
	}
	
}
