package com.cci.questions.StacksAndQueues;

public class StackWithMinimum {
	
	public void push(int value){
		int newMinValue = Math.min(value, beneathMinimum());
		//super.push(new NodeWithMinimum(value, newMinValue));
	}
	
	private int beneathMinimum(){
		/*if(this.isEmpty()){
			return Integer.MAX_VALUE;
		}else{
			peek().min;
		}*/
		return 0;
	}

}
