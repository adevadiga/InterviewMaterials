package com.algorithm.linkedlist;

public class RemoveDuplicateFromLinkedListUnSorted {

	static void removeDuplicate(Node head){
		Node current = head;
		Node prev = null;
		
		while(current != null){
			
			Node runner = head;
			while(runner != current){
				if(runner.data == current.data){
					//remove current node
					Node temp = current.next;
					prev.next = temp;
					current = temp;
					break;
				}
				
				runner = runner.next;
			}
			/*
			 *If not from break, then only move current. 
			 *Else current has been updated already as part of removing, so skip it 
			 */
			if(runner == current){
				prev = current;
				current = current.next;
			}
		}
	}
}
