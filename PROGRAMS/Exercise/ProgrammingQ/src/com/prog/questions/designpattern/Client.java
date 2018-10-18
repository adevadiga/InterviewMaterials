package com.prog.questions.designpattern;

public class Client {

	public static void start(){
		Factory creator = new ConcreteFactory();
		ConcreteProduct p = (ConcreteProduct) creator.getProduct();
		p.foo();
	}
}
