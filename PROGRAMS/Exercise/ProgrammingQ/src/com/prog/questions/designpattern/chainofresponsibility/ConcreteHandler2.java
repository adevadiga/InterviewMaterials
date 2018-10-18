package com.prog.questions.designpattern.chainofresponsibility;

public class ConcreteHandler2 extends Handler {

	@Override
	public void handleRequest(Request request) {
		if(request.getValue() > 0){
			System.out.println("Negative values are handled by ConcreteHandler2:");
			System.out.println("ConcreteHandler2.HandleRequest : " + request.getDescription()
						 + request.getValue());
		}else{
			super.handleRequest(request);
		}

	}

}
