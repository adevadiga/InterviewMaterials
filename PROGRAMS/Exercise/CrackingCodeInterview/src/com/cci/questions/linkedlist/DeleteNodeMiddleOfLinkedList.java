package com.cci.questions.linkedlist;

/*
 * Implement an algorithm to delete a node in the middle of a single linked list,
 * given only access to that node.
 */
public class DeleteNodeMiddleOfLinkedList {

	/*
	 * The solution does not work if n is last node
	 */
	public boolean deleteNode(Node n){
		if(n == null || n.next == null){
			return false;
		}
		
		Node nextNode = n.next;//Copt next node data to nth node and adjsut link
		n.data = nextNode.data;
		n.next = nextNode.next;
		return true;
	}
}
