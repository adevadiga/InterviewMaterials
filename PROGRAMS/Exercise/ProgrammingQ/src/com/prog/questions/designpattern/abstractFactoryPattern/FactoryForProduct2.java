package com.prog.questions.designpattern.abstractFactoryPattern;

public class FactoryForProduct2 extends AbstractFactory{

	@Override
	public AProduct getAProduct() {
		return new A2Product();
	}

	@Override
	public BProduct getBProduct() {
		return new B2Product();
	}

}
