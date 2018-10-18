package com.vishram.questions;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Producer implements Runnable{
	private final BlockingQueue queue;
	Producer(BlockingQueue queue){
		this.queue = queue;
	}
	@Override
	public void run() {
		while(true){
			try {
			     queue.put(produce());
				//queue.add(produce());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	Object produce(){
		return "anoop"+Math.random();
	}
}
class Consumer implements Runnable{
	private final BlockingQueue queue;
	Consumer(BlockingQueue queue){
		this.queue = queue;
	}
	@Override
	public void run() {	
		while(true){
			try {
				consume(queue.take());
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
	}	
	void consume(Object o){
		System.out.println(o);
	}
}
public class UseBlockingQueue {
	public static void main(String[] args) {
		BlockingQueue<String> q = new ArrayBlockingQueue<String>(10);
		 Producer p = new Producer(q);
	     Consumer c1 = new Consumer(q);
	     Consumer c2 = new Consumer(q);
	     new Thread(p).start();
	     new Thread(c1).start();
	     new Thread(c2).start();
	}

}
