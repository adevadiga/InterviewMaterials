package com.javaquestions.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable<Integer>{

	String word;
	public CallableTask(String word) {
		this.word = word;
	}
	@Override
	public Integer call() throws Exception {
		return  word.length();
	}
	
}
public class CallableDemo {

	public static void main(String[] args){
		ExecutorService exe = Executors.newFixedThreadPool(3);
		List<Future<Integer>> result = new ArrayList<>();
		
		Future<Integer> f = exe.submit(new CallableTask("anoop"));
		result.add(f);
		f = exe.submit(new CallableTask("monalisa"));
		result.add(f);
		
		for(Future<Integer> res : result){
			try {
				res.get();
			} catch (InterruptedException | ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}// 
		}
		
		
		
	}
}
