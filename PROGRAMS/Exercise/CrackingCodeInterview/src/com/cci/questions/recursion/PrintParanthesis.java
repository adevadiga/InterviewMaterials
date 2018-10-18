package com.cci.questions.recursion;

/*
 * We can solve this problem recursively by recursing through the string. On each iteration, we have the index for a particular character in the string.
 *  We need to select either a left or a right paren. When can we use left, and when can we use a right paren?
»»Left: As long as we haven’t used up all the left parentheses, we can always insert a left paren.
»»Right: We can insert a right paren as long as it won’t lead to a syntax error. When will we get a syntax error? 
    We will get a syntax error if there are more right parentheses than left.
    
So, we simply keep track of the number of left and right parentheses allowed. If there are left parens remaining, we’ll insert a left paren and recurse.
 If there are more right parens remaining than left (eg, if there are more left parens used),
 then we’ll insert a right paren and recurse.
 */

public class PrintParanthesis {

	public void printPar(int left, int right, char[] str, int count){
		if(left < 0 || right < left){//If no left and if right is more than left then its invalid
			return; //Invalid state
		}
		
		if(left == 0 && right == 0){
			System.out.println(str);//Print the combination
		}else{
			
			if(left > 0){//If there is left para, add it
				str[count] = '(';
				printPar(left-1, right, str, count+1);
			}
			
			if(right > left){//If there is matching left add right para
				str[count] = ')';
				printPar(left, right-1, str, count+1);
			}
			
		}
	}
	
	public void printPar(int n){
		char[] str = new char[n*2];
		printPar(n, n, str, 0);
	}
}
