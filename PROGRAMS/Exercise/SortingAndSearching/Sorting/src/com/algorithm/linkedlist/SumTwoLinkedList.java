package com.algorithm.linkedlist;

public class SumTwoLinkedList {

	static Node addLists(Node n1, Node n2, int carry){
		
		if(n1 == null && n2 == null){
			return null;
		}
		Node result = new Node(0);
		int value = carry;
		if(n1 != null)
			value += n1.data;
		if(n2 != null)
			value += n2.data;
		result.data = value%10;
		
		
		Node moreNodes = addLists(
				   null==n1?null:n1.next,
				   null==n2?null:n2.next,
				   value > 9 ?1:0
				);
		
		result.next = moreNodes;
		return result;
	}
	
	public static void main(String[] args){
	  int[] a = {1,2};
	  Node n1 = buildList(a);
	  int[] a2 = {6,7};
	  Node n2 = buildList(a2);
	  Node sum = addLists(n1, n2, 0);
	  System.out.println(n1);
	  System.out.println(n2);
	  System.out.println(sum);
	}
	
	static Node buildList(int[] a){
		Node root = null;
		for(int n: a){
			Node t = new Node(n);
		    if(root == null){
		    	root = t;
		    }else{
		    	root.next = t;
		    }
		}
		return root;
	}
}

