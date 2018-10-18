package com.anoop.expression;

public class ConstantNode implements ExpNode{
	
	private Integer value;
	
	public ConstantNode(int value) {
		this.value = value;
	}

	@Override
	public ExpressionType getType() {
		return ExpressionType.ConstantType;
	}

	@Override
	public Integer eval(EvalState evalState) {
		return this.value;
	}

	@Override
	public String getString() {
		return String.valueOf(this.value);
	}
	
	public Integer getValue(){
		return this.value;
	}

}
