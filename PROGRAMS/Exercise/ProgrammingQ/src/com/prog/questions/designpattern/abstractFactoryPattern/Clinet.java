package com.prog.questions.designpattern.abstractFactoryPattern;

public class Clinet {

	public static void test(){
		AbstractFactory fac = FactoryMaker.getFactory("a");
		fac.getAProduct();
		fac.getBProduct();
	}
}
