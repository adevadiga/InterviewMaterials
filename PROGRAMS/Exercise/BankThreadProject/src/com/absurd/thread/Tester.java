package com.absurd.thread;

import java.io.File;

public class Tester {

	public static void main(String[] args){
		if (args.length < 2) {
			System.err.println("input_file numThreads");
			System.exit(-1);
		}
		
		int numThreads = 0;
		try {
			numThreads = Integer.parseInt(args[1]);
		} catch (NumberFormatException e) {
		}
		
		Bank bank = new Bank(numThreads);
		bank.startRun(new File(args[0]));
		
		System.out.println("Hi............");
	}
}
