package com.prog.questions.designpattern.chainofresponsibility;

public class ConcreteHandler3 extends Handler {

	@Override
	public void handleRequest(Request request) {
		if(request.getValue() > 0){
			System.out.println("Negative values are handled by ConcreteHandler3:");
			System.out.println("ConcreteHandler3.HandleRequest : " + request.getDescription()
						 + request.getValue());
		}else{
			super.handleRequest(request);
		}

	}

}
