package com.algorithm.linkedlist;

public class NthNodeFromEndOfLinkedList {

	static Node nthNodeFromLast(Node head, int n){
		Node p1 = head;
		Node p2 = head;
		for(int i=1; i<=n-1;i++){
			if(p2 == null){
				return null;
			}
			p2 = p2.next;
		}
		
		while(p2.next != null){
			p2 = p2.next;
			p1 = p1.next;
		}
		
		return p1;
	}
}
