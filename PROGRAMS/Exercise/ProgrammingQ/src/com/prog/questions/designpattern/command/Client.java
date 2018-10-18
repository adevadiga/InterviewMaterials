package com.prog.questions.designpattern.command;

public class Client {

	public static void test(){
		Light theLight = new Light();
		
		Command flipUp = new FlipUpCommnad(theLight);
		Command flipDwon = new FlipDownCommnad(theLight);
		
		Switch invoker = new Switch();
		
		invoker.storeAndExecute(flipUp);
		invoker.storeAndExecute(flipDwon);
		
	}
}
