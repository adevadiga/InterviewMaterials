package com.cci.questions.StacksAndQueues.multiStacks;

public class ThreeStacksInArray {
	
	static Integer STACK_SIZE;
	int[] buffer;
	int[] freeList;
	int[] stackPointer;
	
	int nextFreeIndex;
	
	public ThreeStacksInArray(int noOfStacks) {
		buffer = new int[STACK_SIZE*noOfStacks];
		freeList = new int[STACK_SIZE*noOfStacks];
		stackPointer = new int[noOfStacks];
		
		for(int i=0;i<noOfStacks;i++){
			stackPointer[i] = -1;
		}
		for(int i=0;i<STACK_SIZE*noOfStacks;i++){
			freeList[i]=i+1;
		}
		freeList[STACK_SIZE*noOfStacks-1]=-1;
		
		nextFreeIndex = 0;
	}
	
	public void push(int value, int stackNum){
		int index = nextFreeIndex;
		nextFreeIndex = freeList[index];
		
		freeList[index] = stackPointer[stackNum];//Store Backward pointer element for current pushed element, that is current top for this stacknum
		
		stackPointer[stackNum] = index;
		
		buffer[index]=value;
	}
	
	public int pop(int stackNum){
	    int topElemIndex = stackPointer[stackNum];
	    stackPointer[stackNum] = freeList[topElemIndex]; //Update top of stack to the backward element
	    
	    freeList[topElemIndex] = nextFreeIndex; //Return the topElemIndex as freeList. Previously it used to hold a backward pointer, now changed it to hold next
	    										//free slot. That is nextFreeIndex, As we did in constustor. U r doing now in the content of freeList
	    
	    nextFreeIndex = topElemIndex;           //Make the nextFreeIndex as currenlty removed index position on buffer
	    
	    return buffer[topElemIndex];
	}
	
	
	
	
	
	
	
	

}
