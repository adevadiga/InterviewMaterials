package com.prog.questions;

public class MaxConsec1s {
	
	public static void runMe(){
		int[] a = {1,0,1,1,0,1,1,1,0,1,1,0,0,1,0,1,1,1};
		//findMaxOnes(a);
		findMacOnesWithAZeroInBetween(a);
		
		int[] b = {0,1,1,1,0,1,1,0,0};
		maxOneIndex(b);
	}
	
	public static void maxOneIndex(int[] a){
		int maxCount=0;
		int goldenIndex=-1;
		int prevZero=-1;
		int prevPrevZero=-1;
		
		for(int i=0;i<a.length;i++){
			
			if(a[i] == 0){
				
				if(i - prevPrevZero > maxCount){
					maxCount = i-prevPrevZero;
					goldenIndex = prevZero;
				}
				
				prevPrevZero = prevZero;
				prevZero = i;
				
			}
			
		
			
		}
		 if (a.length-prevPrevZero > maxCount)
			 goldenIndex = prevZero;
		System.out.println("Goldem goose "+goldenIndex);
	}
	
	public static void findMacOnesWithAZeroInBetween(int[] a){
		
		int prevOneIndex = -1;
		int prevZeorIndex = -1;
		int curLen=0,maxLen=0;
		int goldenZeroIndex = 0;
		
		for(int i=0;i<a.length;i++){
			if(a[i] == 0){
				prevZeorIndex = i;
			}else{
				prevOneIndex = i;
			}
			
			if(prevZeorIndex > prevOneIndex && prevZeorIndex != prevOneIndex+1){
				continue;
			}
			curLen = i - prevZeorIndex;
			if(curLen > maxLen){
				maxLen =curLen;
				goldenZeroIndex = prevZeorIndex;
			}
			
		}
		System.out.println("Golden Zero Index: "+goldenZeroIndex);
	}

	public static void findMaxOnes(int[] a){
		int curLen = 0;
		int maxLen = 0;
		int lastZeroIndex= -1;
		int goldenZeroIndex = -1;
		
		for(int i=0;i<a.length;i++){
			if(a[i] == 0){
				lastZeroIndex = i;
			}
		
		   curLen = i-lastZeroIndex;
		   if(curLen > maxLen){
			maxLen = curLen;
		   }
		}
		
		System.out.println("Max length "+maxLen);
	}
  
}
