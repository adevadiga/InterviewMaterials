package com.workbook.worksheet;

public class ChildTestPrivateInheritance extends TestPrivateInheritance {

	private void foo(){
		System.out.println("Fooo in child");
	}
	
	public void run(TestPrivateInheritance t){
		//t.foo();
	}
}
