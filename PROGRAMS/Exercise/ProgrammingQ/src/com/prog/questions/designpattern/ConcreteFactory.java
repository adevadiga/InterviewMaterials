package com.prog.questions.designpattern;

public class ConcreteFactory extends Factory {

	@Override
	public Product getProduct() {
		return new ConcreteProduct();
	}

}
