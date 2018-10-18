package com.cci.questions.linkedlist;

public class NthNodeFromEndOfLinkedList {

	public void nthNodeFromLastMethod1(Node head, int n){
		int len = 0;
		Node temp = head;
		while(temp !=null){
			temp = temp.next;
			len++;
		}
		temp =head;
		
		for(int i=1; i<len-n+1;i++){
			temp = temp.next;
		}
		//temp is needed node
		System.out.println(temp.data);
	}
	
	public void nthNodeRecursion(Node head, int n, int len){
		if(head == null){
			return;
		}
		nthNodeRecursion(head.next, n, len);
		if(++len == n){
			System.out.println(head.data);
			return;
		}
	}
	
	/*
	 * Study this
	 */
	public Node effeicient(Node head, int n){
		if(head == null || n<1){
			return null;
		}
		Node p1 = head, p2 = head;
		//Make a gap of n between p1 and p2, increment p2 by n-1 step
		for(int i=1; i<=n-1;i++){
			if(p2 == null){
				return null; //Not found
			}
			p2 = p2.next;   
		}
		
		while(p2.next != null){
			p1 = p1.next;
			p2 = p2.next;
		}
		return p1;
		
	}
}
