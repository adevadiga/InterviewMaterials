package com.anoop.singleton;

public class Singleton {

	private Singleton(){};
	private static final Singleton instance = new Singleton();
	
	public Singleton getInstance(){
		return instance;
	}
}

class Singleton2{
	
	private volatile Singleton2 instance = null;
	private Singleton2(){};
	public Singleton2 getInstance(){
		if(instance == null){
			synchronized (Singleton2.class) {
				if(instance == null){
					instance = new Singleton2();
				}
			}
		}
		
		return instance;
	}
}

class Singleton3{
	
	private Singleton3(){};
	 /**
     * SingletonHolder is loaded on the first execution of Singleton.getInstance() 
     * or the first access to SingletonHolder.INSTANCE, not before.
     */

	private static class SingletonHolder{
	   private static final Singleton3 instance = new Singleton3();
	}
	
	public Singleton3 getInsatnce(){
		return SingletonHolder.instance;
	}
}