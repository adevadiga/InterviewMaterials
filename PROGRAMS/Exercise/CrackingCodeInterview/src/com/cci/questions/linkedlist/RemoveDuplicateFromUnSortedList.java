package com.cci.questions.linkedlist;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicateFromUnSortedList {

	/*
	 * Using a buffer
	 */
	public void removeDuplicate(Node head){
		Map<Integer, Boolean> buffer = new HashMap<Integer, Boolean>();
		Node previous = null;
		while(head != null){
			if(buffer.get(head.data)){
				previous.next = head.next;
			}else{
				previous = head;
				buffer.put(head.data, true);
			}
			head = head.next;
		}
	}
	
	/*
	 * Without buffer
	 */
	
	public void removeDuplicateEffe(Node head){
		Node prev = null;
		Node current = head;
		
		while(current != null){			
			Node runner = head;
			
			while(runner != current){				
				if(runner.data == current.data){
					Node temp = current.next; //Remove current
					prev.next = temp;
					current = temp;
					break; //Already done
				}
				runner = runner.next;
			}
			/*
			 *If not from break then only move current. Else current has benn updated already so skip it 
			 */
			if(runner == current){
				prev = current;
				current = current.next;
			}
		}
		
		
		
		
	}
}
