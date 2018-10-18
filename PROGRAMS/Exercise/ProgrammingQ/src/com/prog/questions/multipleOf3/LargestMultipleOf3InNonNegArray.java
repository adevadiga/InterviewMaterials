package com.prog.questions.multipleOf3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;


public class LargestMultipleOf3InNonNegArray {
	
	public static void test(){
		//int[] a = new int[]{8, 1, 7, 6, 0};
		largestMultipleOf3(new int[]{1 ,5, 11});
	}

	/*
	 * Assume that number 1 2 3 5 8
	 * q1 -> {2} {3}
	 * q2 -> {1} {8}
	 * q2 -> {5}
	 * 
	 * Sum is: 19
	 * sum%3 == 1
	 * remove 1 element of q2->1 removed
	 * remaining sum is : 18
	 * Just sort those elements
	 */
     static int largestMultipleOf3(int[] a){
		
    	 // Step 1: sort the array in ascending order
    	 Arrays.sort(a);
    	 
    	 Queue<Integer> q1 = new LinkedList<Integer>();
    	 Queue<Integer> q2 = new LinkedList<Integer>();
    	 Queue<Integer> q3 = new LinkedList<Integer>();
    	 
    	 int sum=0;
    	 /*The number and sum of its digits leave same remainder.
    	  * Find the sum of digits. In each sum get reminder and keep the digit in appropriate 
    	  * queue.
    	  */
    	 for(int i=0;i<a.length;i++){
    		 sum += a[i]; //Note adding elements but checking sum condition
    		 
    		 if(sum%3 == 0){
    			 q1.offer(a[i]);
    		 }else if(sum%3==1){
    			 q2.offer(a[i]);
    		 }else{
    			 q3.offer(a[i]);
    		 }
    		 
    	 }
    	 
    	 System.out.println("The queue contents..");
    	 System.out.println("q1: "+q1.toString());
    	 System.out.println("q2: "+q2.toString());
    	 System.out.println("q3: "+q3.toString());    	 
    	 System.out.println("End The queue contents..");
    	 
    	 /*
    	  * Now remove the digits from queue which will reduce the sum into divisible by 3
    	  */
    	 if(sum%3==1){
    		 
    		 if(!q2.isEmpty()){
    			 q2.poll();
    		 }else{
    			 //remove 2 elements of q3
    			 if(!q3.isEmpty()){
    				 q3.poll();
    			 }else{
    				 return 0;
    			 }
    			 
    			 if(!q3.isEmpty()){
    				 q3.poll();
    			 }else{
    				 return 0;
    			 }
    		 }
    		 
    	 }else if(sum%3==2){
    		 if(!q3.isEmpty()){
    			 q3.poll();
    		 }else{
    			 //remove 2 elements of q2
    			 if(!q2.isEmpty()){
    				 q2.poll();
    			 }else{
    				 return 0;
    			 }
    			 
    			 if(!q2.isEmpty()){
    				 q2.poll();
    			 }else{
    				 return 0;
    			 }
    		 }
    	 }
    	 
    	 
    	// Empty all the queues into an auxiliary array.
    	 int size = q1.size()+q2.size()+q3.size();
    	 int[] aux = new int[size];
    	 populateAuxiliaryArray(aux, q1, q2, q3);
    	 
    	// Step 3: sort the array in descending order
    	sortArrayInDescendingOrder(aux);

    	 //System.out.println(Arrays.toString(aux));
    	 return 0;
		
	}
     
     static void populateAuxiliaryArray(int[] aux, Queue<Integer> q1, Queue<Integer> q2, Queue<Integer> q3){
    	 int i = 0;
    	 while(!q1.isEmpty()){
    		 aux[i++] = q1.poll();
    	 }
    	 while(!q2.isEmpty()){
    		 aux[i++] = q2.poll();
    	 }
    	 while(!q3.isEmpty()){
    		 aux[i++] = q3.poll();
    	 }
    	 
     }
     static void sortArrayInDescendingOrder(int[] aux){
    	 Comparator<Integer> comparator = new Comparator<Integer>() {
 	        @Override
 	        public int compare(Integer o1, Integer o2) {
 	            return o2.compareTo(o1);
 	        }
 	      };
 	      Integer[] boxedAux = new Integer[aux.length];
 	      int i=0;
 	      for(int n:aux){
 	    	 boxedAux[i++] = n;
 	      }
 	      Arrays.sort(boxedAux, comparator);
 	      System.out.println(Arrays.toString(boxedAux));
     }
     
     /*
      * So the remainder obtained by sum of digits and ‘n’ is same.

Following is a solution based on the above observation.

1. Sort the array in non-decreasing order.

2. Take three queues. One for storing elements which on dividing by 3 gives remainder as 0.The second queue stores digits which on dividing by 3 gives remainder as 1. The third queue stores digits which on dividing by 3 gives remainder as 2. Call them as queue0, queue1 and queue2

3. Find the sum of all the digits.

4. Three cases arise:
……4.1 The sum of digits is divisible by 3. Dequeue all the digits from the three queues. Sort them in non-increasing order. Output the array.

……4.2 The sum of digits produces remainder 1 when divided by 3.
Remove one item from queue1. If queue1 is empty, remove two items from queue2. If queue2 contains less than two items, the number is not possible.

……4.3 The sum of digits produces remainder 2 when divided by 3.
Remove one item from queue2. If queue2 is empty, remove two items from queue1. If queue1 contains less than two items, the number is not possible.

5. Finally empty all the queues into an auxiliary array. Sort the auxiliary array in non-increasing order. Output the auxiliary array.
      */
     
}
