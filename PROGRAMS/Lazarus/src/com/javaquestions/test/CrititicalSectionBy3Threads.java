package com.javaquestions.test;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

class Task{
    public StringBuilder a = new StringBuilder("");
	public void updateName(int n){
		
		System.out.println(Thread.currentThread().getName()+" Entering");
		for(int i=0;i<n;i++){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			a.append(i);
		}
		System.out.println(Thread.currentThread().getName()+" Exiting");
		
		a.append(" | ");
		
	}
}
class TaskRunner implements Runnable{
	Task task;
	CyclicBarrier barrier;
	TaskRunner(Task task, CyclicBarrier barrier){
		this.task = task;
		this.barrier = barrier;
	}
	public void run(){
		try {
			barrier.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  task.updateName(5);	
	}
}
public class CrititicalSectionBy3Threads{

	
	public static void main(String[] args){
		Task task = new Task();
		
		CyclicBarrier barrier = new CyclicBarrier(3);
		
		Thread t1= new Thread(new TaskRunner(task, barrier),"t1");
		t1.start();
		Thread t2= new Thread(new TaskRunner(task, barrier),"t2");
		t2.start();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Thread t3= new Thread(new TaskRunner(task, barrier),"t3");
		t3.start();
		
		Thread t4= new Thread(new TaskRunner(task, barrier),"t4");
		t4.start();
		Thread t41= new Thread(new TaskRunner(task, barrier),"t5");
		t41.start();
		Thread t5= new Thread(new TaskRunner(task, barrier),"t6");
		t5.start();
		
		
		
		/*new Thread(new TaskRunner(task)).start();
		new Thread(new TaskRunner(task)).start();
		new Thread(new TaskRunner(task)).start();
		new Thread(new TaskRunner(task)).start();*/
		try{
		t1.join();
		t2.join();
		t3.join();
		}catch(InterruptedException e){
			
		}
		
		System.out.println(task.a);
	}
}
