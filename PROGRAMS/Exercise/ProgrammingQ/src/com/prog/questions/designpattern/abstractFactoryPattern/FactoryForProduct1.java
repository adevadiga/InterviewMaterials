package com.prog.questions.designpattern.abstractFactoryPattern;

public class FactoryForProduct1 extends AbstractFactory{

	@Override
	public AProduct getAProduct() {
		return new A1Product();
	}

	@Override
	public BProduct getBProduct() {
		return new B1Product();
	}

}
