package com.anoop.algorithm;

import java.util.Arrays;

public class MinMacOfArray {

	public static void findminAndMax(int[] a){
		int n = a.length;
		int min=-1,max=-1;
		if(n % 2 == 1){
			min = a[0];
			max = a[0];
		}else{
			
			if(a[0] < a[1]){
				min = a[0];
				max = a[1];
			}else{
				min = a[1];
				max = a[0];
			}
		}
		int startIndex = n%2 == 0?2:1;
		
		for(;startIndex<=a.length-2;startIndex+=2){
			 if(a[startIndex] < a[startIndex+1]){
				 
				 if(a[startIndex] < min){
	    	    	  min = a[startIndex];
	    	    	  
	    	      }
				 
				 if(a[startIndex+1] > max){
	    	    	  max = a[startIndex+1];
	    	    	  
	    	      }
				 
			}else{
				 if(a[startIndex+1] < min){
	    	    	  min = a[startIndex+1];
	    	    	  
	    	      }
				 
				 if(a[startIndex] > max){
	    	    	  max = a[startIndex];
	    	    	  
	    	      }
				
			}
			
		}
		
		System.out.println(Arrays.toString(a));
		System.out.println("Min "+min+"   max "+max);
	}
}
