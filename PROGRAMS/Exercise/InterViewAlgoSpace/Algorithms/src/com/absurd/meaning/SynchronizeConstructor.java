package com.absurd.meaning;

import java.util.concurrent.atomic.AtomicInteger;

public class SynchronizeConstructor implements Runnable {
    static AtomicInteger c = new AtomicInteger(0);
	SynchronizeConstructor(){
		System.out.println(Thread.currentThread().getName()+" Enter");
		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		c.getAndIncrement();
		System.out.println(Thread.currentThread().getName()+" Exit");
	}
	@Override
	public void run() {
		for(int i=0;i<100;i++){
			SynchronizeConstructor r = new SynchronizeConstructor();
		}
	}
	
	public static void main(String[] args){
		SynchronizeConstructor s = new SynchronizeConstructor();
		Thread t1 = new Thread(s);
		t1.setName("messi");
		t1.start();
		Thread t2 = new Thread(s);
		t2.setName("torres");
		t2.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(SynchronizeConstructor.c);
	}
}
