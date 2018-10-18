package com.anoop.expression;

public class IdentifierNode implements ExpNode {
	
	private String variableName;
	
	public IdentifierNode(String variableName) {
		this.variableName=variableName;
	}

	@Override
	public ExpressionType getType() {	
		return ExpressionType.IdentifierType;
	}

	@Override
	public Integer eval(EvalState evalState) {
		if(!evalState.isDefined(this.variableName)){
			//throw exception
			
		}
		return evalState.getValue(this.variableName);
	}

	@Override
	public String getString() {
		return this.variableName;

	}

	public String getVariableName(){
		return this.variableName;
	}
}
