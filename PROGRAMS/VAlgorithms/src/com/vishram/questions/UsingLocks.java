package com.vishram.questions;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Counter{
	int count;
	Lock lock;
	Counter(Lock lock){
		this.lock = lock;
	}
	
  int getCounter(){
	  
	  lock.lock();
	  try{count++;
	    
	    return count;
	  }finally{
		  lock.unlock();
	  }
	  
  }
}
public class UsingLocks {

	public static void main(String[] args){
		Lock lock = new ReentrantLock();
		final Counter counter = new Counter(lock);
		Runnable r  = new Runnable(){
			@Override
			public void run() {
				System.out.printf("Count at thread %s is %d %n", Thread.currentThread().getName(), counter.getCounter());
			}
		};
		
		new Thread(r).start();
		new Thread(r).start();
		new Thread(r).start();
		
		
	}
}
