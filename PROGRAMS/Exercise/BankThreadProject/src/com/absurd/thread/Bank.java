package com.absurd.thread;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream.PutField;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;

public class Bank {

	private List<Account> accounts = new ArrayList<Account>();
	private ArrayBlockingQueue<Transaction> queue;
	
	static CountDownLatch latch;
	
	private final int QUEUESIZE = 30;
	private final Transaction nullTrans = new Transaction(new Account(-1),new Account(-1),0);
	private final int numThreads = 5;
	private final int numAccounts = 20;
	
	
	
	private class WorkerThread extends Thread
	{
		@Override
		public void run(){
			boolean done  = false;
			while(!done){
				
				try {
					Transaction transaction = queue.take();
					if(transaction == nullTrans){
						//Queue is empty now finish it.
						done = true;
					}else{
						transaction.carryOutTransaction();						
					}
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
			System.out.println(Thread.currentThread().getName() + " is done.");
			latch.countDown();
		}
	}
	
	public Bank(int numOfThreads){
		queue = new ArrayBlockingQueue<Transaction>(QUEUESIZE);
		latch = new CountDownLatch(numOfThreads);
		for (int i = 0; i < numAccounts; i++) {
			accounts.add(new Account(i, 1000));
		}
		
		for (int i = 0; i < numThreads; i++) {
			 new WorkerThread().start();
		}
		
		/*//Start threads
		for (int i = 0; i < numThreads; i++) {
			 new WorkerThread().start();
		}*/
	}
	
	public  void startRun(File file ){
		
		//Read file
		kickOffFileREading(file);
		
		/*for (int i = 0; i < numThreads; i++) {
			 new WorkerThread().start();
		}*/
		
		
		
		//Wait for thrread
		try {
			latch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("All done");	
		for (Account a : accounts) {
			System.out.println(a);
		}
	}
	
	
	private void kickOffFileREading(File file){
		
		String line = null;
		try {
			BufferedReader in = new  BufferedReader(new FileReader(file));
			while( (line = in.readLine()) != null){
				Transaction trans = readTransactionObject(line);
				queue.put(trans);//This blocks if queue is full
			}
			in.close();
			queue.put(nullTrans);
			
			
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(InterruptedException e){
			
		}
		
	}
	
	private Transaction readTransactionObject(String line){
		int[] values = new int[3];
		int found = 0, prevIndex = 0;
		int c=0;
		for(; c<line.length(); c++){
			if(Character.isSpaceChar(line.charAt(c)) && found < 3){
				values[found++] = Integer.parseInt(line.substring(prevIndex, c));
				prevIndex = c+1;
			}
		}
		
		values[found++] = Integer.parseInt(line.substring(prevIndex, c));
		return new Transaction(new Account(values[0]),new Account(values[1]),values[2]);
	}
}
