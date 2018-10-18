package com.absurd.programs.linkedlist;

public class ReverseSinglyLinkedList {

	public Node reverse(Node head){
		Node  p = head;
		Node reverse = null;
		Node temp = null;
		while(p != null){
			temp = p;
			p = p.next; //P should be here only
			
			temp.next = reverse;
			reverse = temp;			
			
		}
		
		return reverse;
	}
	
	public Node reverseWithNoExtraList(Node head){
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
		return head;
	}
}
