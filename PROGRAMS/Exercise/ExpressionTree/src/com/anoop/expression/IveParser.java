package com.anoop.expression;

import java.util.Scanner;
import java.util.regex.Pattern;

public class IveParser {
	
	public ExpNode parseExp(Scanner scanner){
		ExpNode expression = readE(scanner);
		if(scanner.hasNext()){
			//Error
		}
		
		return expression;
	}
	
	ExpNode readE(Scanner scanner){
		ExpNode exp = readT(scanner);
		
		
		Pattern pattern = Pattern.compile("[+-/=]");
		if(scanner.hasNext(pattern)){
			 String token = scanner.next();
			 ExpNode rhs = readE(scanner);	
		     exp = new CompoundNode(token.charAt(0), exp, rhs);
		}
		return exp;
		/*if(isOperator(token)){
		     ExpNode rhs = readE(scanner);	
		     exp = new CompoundNode(token.charAt(0), exp, rhs);
		}*/
	}
	
	ExpNode readT(Scanner scanner){
		ExpNode exp = null;
		String token = scanner.next();
		if(token.matches("\\d+")){
			exp = new ConstantNode(Integer.parseInt(token));
		}else if(token.matches("[a-zA-Z]+")){
			exp = new IdentifierNode(token);
		}else if(token == "("){
			exp = readE(scanner);
			
			if(scanner.next() != ")"){
				//Error
			}
			
		}else{
			//error
		}
		return exp;
		
	}

}
