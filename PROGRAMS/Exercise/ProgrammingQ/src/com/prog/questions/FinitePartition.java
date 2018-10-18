package com.prog.questions;

import java.util.ArrayList;
import java.util.List;

public class FinitePartition {

	static int MAX_POINT = 3;
	static int[] arr =  new int[100]; 
	static List<Integer> partitionList = new ArrayList<Integer>();
	static void test(){
		List result = new ArrayList<Integer>();
		partition(4,0 );
	}
	static void partition(int n, int index){
		
		//Does not work for n <=0 condition
		//both if else condition are necessary
		if(n == 0){
			for(int k=0;k<index;k++){
				System.out.print(arr[k]+" ");
			}
		}else if(n > 0){
			
			for(int i=1;i<=MAX_POINT;i++){
				/*partitionList.add(i);*/
				arr[index] = i;
				partition(n-i, index+1);
			}
		}
		
		
	}
	
	static void printListContents(List list,int index){
		int size = list.size();
		for(int i=0;i<index;i++){
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
	}
}
