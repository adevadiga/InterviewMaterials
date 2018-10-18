package com.anoop.expression;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Application {

  public static void main(String[] args) {
	  
	EvalState evalStatte = EvalState.getInstance();

	Scanner inputScanner = new Scanner(new InputStreamReader(System.in));


	while(true)
	{
		System.out.println("Enter expression:");
		String line = inputScanner.nextLine();
		Scanner scanner = new Scanner(line);
		scanner.useDelimiter("\\p{javaWhitespace}+");
		ExpNode exp = new IveParser().parseExp(scanner);

		System.out.println(exp.eval(evalStatte));
	}
	
	
	 
  }
  
 
}
