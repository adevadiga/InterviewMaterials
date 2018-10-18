package com.absurd.programs.linkedlist;

public class FindMiddleOfLinkedList {

	public void findMiddleOfLinkedList(Node head){
		Node p1 = head;
		Node p2 = head;
		while(p2.next != null){
			p1 = p1.next;
			p2 = p2.next.next;
		}
		
		System.out.println(p1.data);
	}
}
