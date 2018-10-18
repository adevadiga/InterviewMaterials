package com.javaquestions.test;

public class FinalizeTest {

	String a="anoop";
	String m=new String("messi");
	String s=new String("saurez");
	public void testFinalize(){
		
		System.out.println("Inside testFinalize method");
	}
	
	@Override
	public void finalize(){
		System.out.println("In finalize");
	}
	
	public static void main(String[] args){
		for(int i=0;i<100;i++){
			new FinalizeTest();
		}
		Runtime.getRuntime().gc();
		System.exit(0);
		for(int i=0;i<100;i++){
			new FinalizeTest();
		}
	}
}
