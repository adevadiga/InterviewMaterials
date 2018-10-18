package com.prog.questions.designpattern.chainofresponsibility;

public class Test {

	public static void run(){
		
		ConcreteHandler1 c1 = new ConcreteHandler1();
		ConcreteHandler2 c2 = new ConcreteHandler2();
		ConcreteHandler2 c3 = new ConcreteHandler2();
		
		c1.setSuccessor(c2);
		c2.setSuccessor(c3);
		
		c1.handleRequest(new Request("Negative Value ", -1));
		c1.handleRequest(new Request("Negative Value ",  0));
		c1.handleRequest(new Request("Negative Value ",  1));
		c1.handleRequest(new Request("Negative Value ",  2));
		c1.handleRequest(new Request("Negative Value ", -5));
	}
}
