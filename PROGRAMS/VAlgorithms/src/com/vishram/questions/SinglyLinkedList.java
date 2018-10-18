package com.vishram.questions;

import java.util.concurrent.ConcurrentHashMap;

public class SinglyLinkedList<E> {
	
	Node<E> first;
	Node<E> last;
	int size;
	public SinglyLinkedList(){
		
	}
	
	public boolean add(E e){
		Node<E> l = last;
		Node<E> newNode = new Node(e, null);
		if(l == null){
			first = newNode;
		}else{
			l.next = newNode;
		}
		last = newNode;
		size++;
		return true;
	}
	
	public boolean remove(Object o){
		if(o == null){
			Node<E> prev = null;
			for(Node<E> x = first; x != null;x=x.next){
				if(x.data == null)
				{
				  unlink(x, prev);
				  return true;
				}
				prev = x;
			}
		}else{
			Node<E> prev = null;
			for(Node<E> x= first; x != null; x = x.next){
				if(o.equals(x.data)){
					unlink(x, prev);
					return true;
				}
			}
		}
		
		return false;
		
	}
	
	private Node<E> unlink(Node<E> x, Node<E> prev)
	{
		Node<E> temp = x;
		if(prev == null){
			first = x.next;
		}else{					 
			prev.next = temp.next;
		}
		size--;
		return temp;
		
	}
	
	Node<E> node(int index){
		Node<E> x = first;
		for(int i=0;i<index;i++){
			x = x.next;
		}
		return x;
		/*if(index < (size >> 1)){
			Node<E> x = first;
			for(int i=0;i<index;i++){
				x = x.next;
			}
			return x;
		}else{
			Node<E> x = last;
			for(int i=0;i<index;i++){
				x = x.next;
			}
		}*/
	}

	private static class Node<E>{
		E data;
		Node<E> next;
		
		Node(E data, Node<E> next){
			this.data = data;
			this.next = next;
		}
	}
}
