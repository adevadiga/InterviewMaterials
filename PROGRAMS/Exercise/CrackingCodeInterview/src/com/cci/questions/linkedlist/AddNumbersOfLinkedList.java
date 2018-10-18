package com.cci.questions.linkedlist;

/*
 * You have two numbers represented by a linked list, where each node contains a single digit. The digits are stored in reverse order, such that the 1’s digit is at the head 
 * of the list. 
 * Write a function that adds the two numbers and returns the sum as a linked list.
 */
public class AddNumbersOfLinkedList {

	public Node addLists(Node n1, Node n2, int carry){
		if(n1==null && n2==null){
			return null;
		}
		Node result = new Node(0);
		int value = carry;
		if(n1 != null){
			value += n1.data;
		}
		if(n2 != null){
			value += n2.data;
		}
		
		result.data = value%10;
		Node moreNodex = addLists(n1 == null ?null:n1.next,
								  n2 == null ?null:n2.next,
								  value > 9 ?1:0);
		result.next = moreNodex;
		return result;
	}
}
