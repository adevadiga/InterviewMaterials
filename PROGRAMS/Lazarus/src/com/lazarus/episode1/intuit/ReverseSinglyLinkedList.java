package com.lazarus.episode1.intuit;

class Node{
	int key;
	Node next;
	Node prev;
	Node(int key){
		this.key = key;
		this.next = null;
	}
}
public class ReverseSinglyLinkedList {
	
	
	static Node reverseRecurse(Node head)
	{
		if(head == null || head.next == null) return head;
		
		Node rest = reverseRecurse(head.next);
		head.next.next = head;
		head.next = null;
		return rest;
	}

	static Node reverseDoubly(Node first){
		if(first == null || first.next == null) return first;
		Node rest = reverseDoubly(first.next);
		first.prev = first.next;
		first.next.next = first;
		first.next = null;
		return rest;
	}
	static Node reverse(Node head){
		Node current = head;
		Node previous = null;
		Node nextNode = null;
		
		while(current != null){
			nextNode = current.next;
			current.next = previous;
			previous = current;
			
			current = nextNode;
		}
		head = previous;
		return previous;
	}
	
	public static void main(String[] args) {
		int[] a = {1,2,3};
		  Node n1 = buildList(a);
		  System.out.println(n1);
		  n1 = reverse(n1);
		  System.out.println(n1);
	}
	static Node buildList(int[] a){
		Node root = null;
		Node curr = null;
		for(int n: a){
			Node t = new Node(n);
		    if(root == null){
		    	root = t;
		    	curr = root;
		    }else{
		    	curr.next = t;
		    	curr = curr.next;
		    }
		}
		return root;
	}
}
