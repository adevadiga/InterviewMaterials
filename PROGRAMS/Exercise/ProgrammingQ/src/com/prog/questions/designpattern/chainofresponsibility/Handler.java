package com.prog.questions.designpattern.chainofresponsibility;

public abstract class Handler {

	protected Handler successor;
	
	public void setSuccessor(Handler successor){
		this.successor = successor;
	}
	
	public void handleRequest(Request request)
	{
		successor.handleRequest(request);
	}
}
