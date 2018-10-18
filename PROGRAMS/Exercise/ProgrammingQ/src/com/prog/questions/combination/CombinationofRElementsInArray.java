package com.prog.questions.combination;

public class CombinationofRElementsInArray {

	public static void test(){
		int[] input ={1, 2, 3, 4, 5};
		int[] output = new int[3];
		int elementsToConsider = 3;
		combination(input, output, 0, input.length-1, 0, elementsToConsider);
	}
	
	static void combination(int[] input, int[] output, int start, int end, int index, int r){
		if(index == r){
			for(int no:output)
			{
				System.out.print(no+" ");
			}
		    System.out.println();
		    return;
		}
		//end-i+1 >= r-index
		//4-2+1 >= 2-2  => 1 >=0 
		
		//for(int i=start; i<=end;i++)
		/*Note for i if it reaches index - 3 in the above case, only 1 elem is to the right
		 * It cant be a combination. We can skip this.
		 * Also note that we need to consider the case when remaining char is 1 however its a part of
		 * building-that is 2 char are already considered. Hence use index
		 * "end-i+1 >= r-index"
		 * 4-3+1 ->is No Elem remain after
		 */
	
	    for (int i=start; i<=end && end-i+1 >= r-index; i++)
	    {
			output[index] = input[i];
			combination(input, output, i+1, end, index+1, r);
		}
		
	}
}
