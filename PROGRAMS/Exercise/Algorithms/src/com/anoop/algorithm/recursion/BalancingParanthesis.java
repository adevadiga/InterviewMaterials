package com.anoop.algorithm.recursion;

public class BalancingParanthesis {
	
	public static void run(){
		
		String s = "([])";
		System.out.println(new BalancingParanthesis().isBalanced(s));
	}

	boolean isBalanced(String expr){
		if(expr.isEmpty()){
			return true;
		}else if(containsBrackets(expr)){
			//Remove correct matching brackets of 1 set. And go on further test
			String next = removeBrackets(expr);
			return isBalanced(next);
		}
			
		return false;
	}
	
	boolean containsBrackets(String expr){
		return expr.contains("[]") || expr.contains("{}") || expr.contains("()");		
	}
	
	String removeBrackets(String expr){
	    String brackets = null,result=null;
	    if(expr.contains("[]")){
	    	brackets = "[]";
	    }else if(expr.contains("{}")){
	    	brackets = "{}";
	    }else if(expr.contains("()")){
	    	brackets = "()";
	    }
	    result = expr.replace(brackets, "");
	    
	    return result;
	}
}
