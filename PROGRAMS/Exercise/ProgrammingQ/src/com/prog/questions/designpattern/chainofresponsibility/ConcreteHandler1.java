package com.prog.questions.designpattern.chainofresponsibility;

public class ConcreteHandler1 extends Handler {

	@Override
	public void handleRequest(Request request) {
		if(request.getValue() < 0){
			System.out.println("Negative values are handled by ConcreteHandler1:");
			System.out.println("\tConcreteHandlerOne.HandleRequest : " + request.getDescription()
						 + request.getValue());
		}else{
			super.handleRequest(request);
		}

	}

}
