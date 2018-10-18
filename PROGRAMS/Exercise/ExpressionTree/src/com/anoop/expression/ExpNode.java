package com.anoop.expression;

public interface ExpNode {

	ExpressionType getType();
	
	Integer eval(EvalState evalState);
	
	String getString();
}
