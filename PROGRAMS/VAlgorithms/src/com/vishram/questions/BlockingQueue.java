package com.vishram.questions;

import java.util.LinkedList;
import java.util.List;

public class BlockingQueue {

	private List queue = new LinkedList();
	private int limit;
	BlockingQueue(int limit){
		this.limit = limit;
	}
	
	public synchronized void enQueue(Object item) throws InterruptedException  {
		if(isFull()){//If full wait
			wait();
		}
		if(isEmpty()){
			notifyAll();
		}
		queue.add(item);
	}
	
	public synchronized void deQueue() throws InterruptedException {
		if(isEmpty()){
			wait();
		}
		if(isFull()){
			notifyAll();
		}
		queue.remove(0);
	}
	
	private boolean isFull(){
		return queue.size()==limit;
	}
	private boolean isEmpty(){
		return queue.size() == 0;
	}
}
