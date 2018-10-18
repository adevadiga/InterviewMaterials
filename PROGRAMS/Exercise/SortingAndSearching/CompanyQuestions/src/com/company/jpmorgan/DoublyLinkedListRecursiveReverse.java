package com.company.jpmorgan;

import javax.sound.sampled.ReverbType;

class Node{
	int data;
	Node previous;
	Node next;
	Node(int data){
		this.data = data;
	}
	
	void appendToTail(int data){
		Node t = new Node(data);
		Node n = this;
		while(n.next != null){
			n = n.next;
		}
		n.next = t;
		t.previous = n;
		
	}
	
	Node reverseSingly(Node first){
		if(first == null || first.next == null) return first;
		//if(first.next == null) return first;
		Node rest = reverseSingly(first.next);
		
		first.next.next = first;
		first.next = null;
		return rest;
	}
	Node reverseDoubly(Node first){
		if(first == null) return first;
		if(first.next == null) return first;
		Node rest = reverseDoubly(first.next);
		
		first.previous = first.next;
		first.next.next = first;
		//first.next.previous = null;
		first.next = null;		
		return rest;
	}
	Node reverseDoubly2(Node first){
		if(first == null) return null;
		
		//swap preva and next ptr
		Node t = first.next;
		first.next = first.previous;
		first.previous = t;
		
		if(first.previous == null) return first;
		
		return reverseDoubly2(first.previous);
	}
	
	
	
	
	
	
	
	Node reverseSingleLinkedList(Node head){
		if(head.next == null){
			return head;
		}
		Node rest = reverseSingleLinkedList(head.next);
		Node t = rest;
		while(t.next != null){
			t = t.next;
		}
		t.next = head;
		head.next = null;
		return rest;
	}
	Node reverseDoublyLinkedList(Node head){
		if(head.next == null){
			return head;
		}
		//Node reverse = head;
		Node rest = reverseDoublyLinkedList(head.next);
		Node t = rest;
		while(t.next != null){
			t = t.next;
		}
		t.previous = t.next;
		t.next = head;
		
		head.next = null;
		head.previous = t;
		return rest;
		
		/*head.next = head.previous;
		head.previous = rest;
		return head;*/
		
	}
	public String toString(){
		return data+" => "+ (null == this.next?"":this.next.toString());
	}
}
public class DoublyLinkedListRecursiveReverse {

	public static void main(String[] args){
		Node head = new Node(1);
		head.appendToTail(2);
		head.appendToTail(3);
		head.appendToTail(4);
		System.out.println(head);
		
		//Node r = head.reverseSingleLinkedList(head);
		/*Node r = head.reverseSingly(head);
		System.out.println(r);*/
		
		Node r = head.reverseDoubly(head);
		System.out.println(r);
	}
}
