package com.javaquestions.test;

import java.io.FileNotFoundException;

public class ReturnInFinallyTest {

	public int test(){
		try{
			//int i = 1/0;
			//throw new Error();
			return 1;
		}catch(Error e){
			System.out.println("Error cauht");
			return 1;
		}finally{
			
			System.exit(0);
			return 2;
		}
	}
	
	public static void main(String[] args){
		System.out.println("Started...");
		int k = new ReturnInFinallyTest().test();
		System.out.println(k);
	}
}
