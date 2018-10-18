package com.algorithm.linkedlist;

public class ReverseSinglyLinkedList {

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
