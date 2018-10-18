package com.prog.questions;

import java.util.ArrayList;
import java.util.List;

public class CommonElementsInArray {

	public static void test(){
		int[] a={1, 5, 10, 20, 40, 80};
		int[] b= {6, 7, 20, 80, 100};
		int[] c={3, 4, 15, 20, 30, 70, 80, 120};
		findCommon(a, b, c);

	}
	/*
	 * All arrays are sorted
	 */
	public static void findCommon(int[] a, int[] b, int[] c){
		
	  int i=0,j=0,k=0;
	  while(i<a.length && j<b.length && k<c.length){
		  int x=a[i],y=b[j],z=c[k];
		  
		  if( x == y && x == z){
			  System.out.println(x);
			  i++;j++;k++;
		  }else if(x < y){
			  i++;
		  }else if(y<z){
			  j++;
		  }else {
			  k++;
		  }
		  
		 /* int max = x>y&&x>z?x:(y>z)?y:z;
		  if(x<max){
			  i++;
		  }
		  if(y<max){
			  j++;
		  }
		  if(z<max){
			  k++;
		  }*/
		  /*if( x == y && x == z){
			  System.out.println(x);
			  i++;j++;k++;
		  } else if(x == y){
			  k++;
		  }else if(x == z){
			  j++;
		  }else if(y == z){
			  i++;
		  }
		  else if(x > y && x > z){
			 j++; k++;
		 }
		 else if(y > z){
			 i++;k++;
		 }else{
			 i++;j++;
		 }*/
		  
	  }
	}
}
