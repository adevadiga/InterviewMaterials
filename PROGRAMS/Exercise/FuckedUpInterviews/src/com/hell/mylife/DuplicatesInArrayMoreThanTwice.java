package com.hell.mylife;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*class Fuck{
	private Fuck(){
		
	}
}

class Up extends Fuck{
	
}*/

public class DuplicatesInArrayMoreThanTwice {

	public static void main(String[] args)
	{
		List l = new ArrayList<Number>();
		List<String> ls = l;
		l.add(0, new Integer(42));
		String s = ls.get(0);
		int[] a = new int[]{1,2,4,9,6,9,6,7,3,9,7,5,7};
		findDuplicates(a);
	}
	public static int[] findDuplicates(int[] a){
		Arrays.toString(a);
		if(a == null){
			return null;
		}		
		int len = a.length;
		if(len < 3){
			return null;
		}
		int tail = 1;
		int[] hit = new int[len];
		
		for(int i=1; i<len;i++)
		{
			int j=0;
			for(; j<tail;j++)
			{
			   if(a[i] == a[j]){
				   hit[i]++;
				   
			   }
			}			
			if(j == tail){
				a[tail] = a[i];
				tail++;
			}
		}
		int noOfDupElem = 0;
		for(int e : hit){
			if(e > 1){ //Appeared more than twice
				noOfDupElem++;
			}
		}
		int[] dup = new int[noOfDupElem];int i=0;
		
		for(int k = 0; k<len;k++){
			if(hit[k] > 1){
				dup[i++] = a[k];
			}
		}
		
		System.out.println(Arrays.toString(dup));
		return dup;
				
	}
}
