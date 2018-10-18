package com.cci.questions.StacksAndQueues;

public class ThreeStatcksInArray {

	public static final Integer STACK_SIZE = 100;
	public Integer indexUsed = 0;
	public StackNode[] buffer = null;
	public int[] stackPointer = null;
	
	public ThreeStatcksInArray(){
		buffer = new StackNode[STACK_SIZE*3];
		stackPointer = new int[]{-1,-1,-1};
	}
	
	public void push(int stackNum, int value){
		int lastIndex = stackPointer[stackNum];
		stackPointer[stackNum] = indexUsed;
		indexUsed++;
		buffer[stackPointer[stackNum]] = new StackNode(lastIndex, value);
	}
	
	public int pop(int stackNum){
		int value = buffer[stackPointer[stackNum]].data;
		int lastIndex = stackPointer[stackNum];
		stackPointer[stackNum] = buffer[stackPointer[stackNum]].prevIndex;
		indexUsed--;
		buffer[lastIndex] = null;
		return value;
	}
	
	public int peek(int stackNum){
		//if(isEmpty(stackNum)){
			return buffer[stackPointer[stackNum]].data;
		//}
		//return -1;		
	}
	
	public boolean isEmpty(int stackNum){
		return stackPointer[stackNum] == -1;
	}
	
	public  void displayStack(int stackNum){
		while(!isEmpty(stackNum)){
			System.out.print(pop(stackNum)+" , ");
		}
		
		
	}
	public static void testMe(){
		ThreeStatcksInArray stack = new ThreeStatcksInArray();
		stack.push(0, 10);
		stack.push(0, 20);
		stack.push(1, 100);
		stack.push(0, 30);
		
		
		stack.pop(0);
		stack.pop(0);
		stack.push(1, 200);
		//stack.displayStack(0);
		System.out.println("------");
		stack.displayStack(1);
		
	}
}
