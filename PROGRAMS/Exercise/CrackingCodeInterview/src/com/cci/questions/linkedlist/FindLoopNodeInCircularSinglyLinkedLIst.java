package com.cci.questions.linkedlist;

/*
 * If we move two pointers, one with speed 1 and another with speed 2, they will end up meeting if the linked list has a loop. Why? Think about two cars driving on a 
 * track—the faster car will always pass the slower one!
The tricky part here is finding the start of the loop. Imagine, as an analogy, two people racing around a track, one running twice as fast as the other.
 If they start off at the same place, when will they next meet? They will next meet at the start of the next lap.
 
Now, let’s suppose Fast Runner had a head start of k meters on an n step lap. When will they next meet? They will meet k meters before the start of the next lap. 
(Why? Fast Runner would have made k + 2(n - k) steps, including its head start, and Slow Runner would have made n - k steps. Both will be k steps before the start of the 
loop.)
Now, going back to the problem, when Fast Runner (n2) and Slow Runner (n1) are moving around our circular linked list, n2 will have a head start on the loop when n1 enters.
 Specifically, it will have a head start of k, where k is the number of nodes before the loop. Since n2 has a head start of k nodes, n1 and n2 will meet k nodes 
 before the start of the loop.
So, we now know the following:
1. Head is k nodes from LoopStart (by definition).
2. MeetingPoint for n1 and n2 is k nodes from LoopStart (as shown above).
Thus, if we move n1 back to Head and keep n2 at MeetingPoint, and move them both at the same pace, they will meet at LoopStart.

 */
public class FindLoopNodeInCircularSinglyLinkedLIst {

	public Node findBeginning(Node head){
		Node n1 = head;
		Node n2 = head;
		while(n2.next != null){
			n1 = n1.next;
			n2 = n2.next.next;
			if(n1 == n2){
				break;  //Found the meting point of n1 and n2
			}
		}
		if(n2.next == null){
			return null;//Not circular
		}
		/*
		 * Move n1 back to head and n2 be at meeting point.
		 * Note that head is k node from starting point of loop and meeting point is also
		 * k node from starting point of loop.
		 * Increment n1 and n2 by single step.
		 * Where they meet its starting point of loop
		 */
		n1 = head;
		while(n1 != n2){
			n1 = n1.next;
			n2 = n2.next;
		}
		
		return n2;
	}
}
