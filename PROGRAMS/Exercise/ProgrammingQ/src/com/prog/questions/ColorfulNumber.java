package com.prog.questions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ColorfulNumber {

	public void isColorfull(int num){
		List<Integer> list = new ArrayList<Integer>();
		//int[] list = new int[4];
		
		int index = 0;
		while(num != 0){
			int r = num % 10;
			num /= 10;
			int length = list.size();
			for(int i = index; i< length;i++){
				list.add(list.get(i)*r);
				System.out.println(list.get(i)+"*"+r);
			}
			list.add(r);
			index = length; //From previous iteration length till this length - add elements in the next iteration.
		}
		
		Set<Integer> setC = new HashSet<Integer>();
		for(Integer n: list){
			if(setC.contains(n)){
				System.out.println("Not colorfule.");
				return;
			}else{
				setC.add(n);
			}
		}
		System.out.println("Colorful");
	}
	
	/*12346
	 ------
	 1
	 ------
	 1*2
	 2
	 -----
	 1*2*3
	 2*3
	 3
	 -----
	 1*2*3*4
	 2*3*4
	 3*4
	 4
	 -----
	 1*2*3*4*6
	 2*3*4*6
	 3*4*6
	 4*6
	 6
	 ------ List of n(n+1)/2 elements
	*/
	
	/*public void isColorfull2(int num){
		List<Integer> list = new ArrayList<Integer>();
		List<String> list2 = new ArrayList<String>();
		//int[] list = new int[4];
		
		int index = 0;
		while(num != 0){
			int r = num % 10;
			num /= 10;
			int length = list2.size();
			for(int i = 0; i< length;i++){
				list2.add(list2.get(i)+"*"+r);
			}
			list2.add(String.valueOf(r));
			index = length;
		}
		
		for(String n:list2){
			System.out.println(n);
		}
		Set<Integer> setC = new HashSet<Integer>();
		for(Integer n: list){
			if(setC.contains(n)){
				System.out.println("Not colorfule.");
			}else{
				setC.add(n);
			}
		}
		
	}*/
}
