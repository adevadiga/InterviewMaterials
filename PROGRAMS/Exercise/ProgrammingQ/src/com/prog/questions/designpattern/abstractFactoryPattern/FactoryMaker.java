package com.prog.questions.designpattern.abstractFactoryPattern;

public class FactoryMaker {

	//private static AbstractFactory pf=null;
	static AbstractFactory getFactory(String choice){
		if(choice.equals("a")){
			return new FactoryForProduct1();
		}else if(choice.equals("b")){
				return new FactoryForProduct2();
			} 
		return null;
	}

}

