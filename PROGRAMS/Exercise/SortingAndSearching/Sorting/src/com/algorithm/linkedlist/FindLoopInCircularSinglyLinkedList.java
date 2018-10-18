package com.algorithm.linkedlist;

public class FindLoopInCircularSinglyLinkedList {

	static Node findLoop(Node head){
		Node p1 = head;
		Node p2 = head;
		while(p2.next != null){
			p2 = p2.next.next;
			p1 = p1.next;
			if(p1 == p2){
				break; //found meeting point of p1 and p2
			}
		}
		if(p2 == null){ //No loop
			return null;
		}
		p1 = head;
		while(p1 == p2){
			p1 = p1.next;
			p2 = p2.next;
		}
		return p2;
	}
}
