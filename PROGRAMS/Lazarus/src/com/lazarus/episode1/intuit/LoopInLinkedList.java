package com.lazarus.episode1.intuit;

class Node{
	int key;
	Node next;
	Node(int key){
		this.key = key;
		this.next = null;
	}
}
public class LoopInLinkedList {

	static Node findLoop(Node head){
		Node p1 = head, p2= head;
		while(p2.next != null){
			p1 = p1.next;
			p2 = p2.next.next;
			
			if(p1 == p2)
				break;
		}
		
		if(p2 == null)
		{
			 System.out.println("No loop");
			 return null;
		}
		
		p1 = head;
		while(p1 != p2){
			p1 = p1.next;
			p2 = p2.next;
		}
		return p2;
		
	}
}
