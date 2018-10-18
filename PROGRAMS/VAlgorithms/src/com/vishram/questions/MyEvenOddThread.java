package com.vishram.questions;

class Printer{
	boolean isOdd = false;
	Printer(boolean isOdd){
		this.isOdd = isOdd;
	}
	 synchronized void printEven(int n){
		while(isOdd){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		isOdd = true;
		System.out.println("Even print - "+n);
		notifyAll();
	}
	 synchronized void printOdd(int n){
		while(!isOdd){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		isOdd = false;
		System.out.println("Odd print - "+n);
		notifyAll();
	}
	
	
}
class EvenOddPrinter implements Runnable{
    Printer printer;
    int max = 10;
    
    boolean isOdd = false;
    EvenOddPrinter(Printer printer, boolean isOdd){
    	this.printer = printer;
    	this.isOdd = isOdd;
    }
	@Override
	public void run() {
		
		for(int i = isOdd?1:0;i<max;i+=2){
			if(i%2==0 && !isOdd){
				printer.printEven(i);
			}else if(isOdd){
				printer.printOdd(i);
			}
		}
		
	}
}
public class MyEvenOddThread {
	
	public static void main(String[] args){
		Printer printer = new Printer(false);
		new Thread(new EvenOddPrinter(printer,false)).start();
		new Thread(new EvenOddPrinter(printer,true)).start();
	}

}
