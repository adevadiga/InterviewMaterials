package com.lazarus.episode1.intuit;

import java.util.HashMap;
import java.util.Map;

class Node{
	int key;
	int value;
	Node prev;
	Node next;
	Node(int key, int value){
		this.key = key;
		this.value = value;				
	}
}
public class LRUCache {

	int capacity;
	Map<Integer,Node> map = new HashMap<>();
	Node head = null;
	Node end = null;
	
	public void set(int key, int value){
		if(map.containsKey(key)){
			Node old = map.get(key);
			old.value = value;
			remove(old);
			appendToHead(old);
		}else{
			
			Node nodeCreated = new Node(key,value);
			if(map.size() >= capacity){
				map.remove(end.key);//Remove last used from Map as well as list
				remove(end);
				appendToHead(nodeCreated);
			}else{
				appendToHead(nodeCreated);
			}
			
			 map.put(key, nodeCreated);//Put to Map
		}
	}
	
	public void remove(Node node){
		if(node.prev != null)
			node.prev.next = node.next;
		else
			head = node.next;
		
		if(node.next != null)
			node.next.prev=node.prev;
		else
			end = node.prev;
	}
	
	public void appendToHead(Node node){
		node.next = head;
		node.prev = null;
		
		if(head != null)
			head.prev = node;
		
		head = node;
		
		if(end == null)
			end = head;
			
	}
	
	public int get(int key){
		if(map.containsKey(key)){
			Node node = map.get(key);
			remove(node);
			appendToHead(node);
			return node.value;
		}
		
		return -1;
	}
}
