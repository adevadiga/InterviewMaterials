package com.ood.callcenter;

public class Employee {

	boolean free;
	CallHandler callHandler;
	int rank;//Fresher, TL, PM
	Employee(int rank){this.rank = rank;}
	public void receiveCall(Call call){
		
	}
    public void callHandled(Call call){
		
	}
    public void cannotHandle(Call call){
		call.rank = call.rank + 1;
		callHandler.dispatchCall(call);
		free = true;
		callHandler.getNextCall(this);
		
	}
    
    
}
