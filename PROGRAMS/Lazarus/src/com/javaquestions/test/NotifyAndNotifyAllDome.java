package com.javaquestions.test;

class DemoTask implements Runnable{

	MonitorObj obj;
	DemoTask(MonitorObj obj){
		this.obj = obj;
	}
	@Override
	public void run() {
	
		synchronized (obj) {
			try {
				obj.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("After wait completetion... "+Thread.currentThread().getName());
	}
}
class DemoNotifyTask implements Runnable{
	MonitorObj obj;
	public DemoNotifyTask(MonitorObj obj) {
		this.obj = obj;
	}
	@Override
	public void run() {
		
	  synchronized (obj) {
		obj.notifyAll();
		System.out.println("After notify... "+Thread.currentThread().getName());
	 }
	  
	  
		
	}
	
}

class MonitorObj{
	
}
public class NotifyAndNotifyAllDome {

	public static void main(String[] args){
		MonitorObj obj = new MonitorObj();
		Thread t1 = new Thread(new DemoTask(obj), "Wait 1");
		Thread t2 = new Thread(new DemoTask(obj), "Wait 2");
		t1.start();
		t2.start();
		Thread t3 = new Thread(new DemoNotifyTask(obj), "Notify 1");
		t3.start();
		System.out.println("Ha ha ha");
	}
}
