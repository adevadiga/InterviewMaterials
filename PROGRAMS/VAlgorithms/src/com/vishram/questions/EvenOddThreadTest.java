package com.vishram.questions;

class EvenOddTask implements Runnable{

	int max;
	boolean isEvenNumber;
	PrinterTask print;
	
	EvenOddTask(int max, boolean isEvenNumber, PrinterTask print){
		this.max =max;
		this.isEvenNumber = isEvenNumber;
		this.print = print;
	}
	
	@Override
	public void run() {
		int n = isEvenNumber?0:1;
		while(n <= max){
			if(isEvenNumber){
				print.printEven(n);
			}else{
				print.printOdd(n);
			}
			n += 2;
		}
		
	}
	
}
class PrinterTask{
	boolean isOdd= false;

	synchronized void printEven(int n){
		while(isOdd){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Even - "+n);
		isOdd = true;
		notifyAll();
	}
	synchronized  void printOdd(int n){
		
		while(!isOdd){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Odd - "+n);
		isOdd = false;
		notifyAll();
	}
	
}
public class EvenOddThreadTest {

	public static void main(String[] args) {
		PrinterTask task = new PrinterTask();
		Runnable even = new EvenOddTask(10, true, task);
		Runnable odd = new EvenOddTask(10, false, task);
		new Thread(even).start();
		new Thread(odd).start();

	}

}
