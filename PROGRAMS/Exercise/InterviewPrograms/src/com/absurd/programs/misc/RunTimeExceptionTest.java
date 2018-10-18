package com.absurd.programs.misc;

public class RunTimeExceptionTest {

	public void honk(){
		System.out.println("honk...");
	}
	public void testNPECatchBehavior(RunTimeExceptionTest ref){
		try{
		ref.honk();
		}catch(NullPointerException npe){
			System.out.println("!!! Caught NPE");
		}
	}
}
