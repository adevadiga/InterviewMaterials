package com.absurd.programs.linkedlist;

import org.junit.Test;

public class ReverseSinglyLinkedListTest {

	@Test
	public void reverseTest(){
		int[] a = new int[]{20,30};
		Node head = new Node(10);
		head.appendToTail(20);
		head.next.appendToTail(30);
		
		System.out.println(head.toString());
		Node reverse = new ReverseSinglyLinkedList().reverse(head);
		System.out.println(reverse.toString());
		
	}
}
