package com.javaquestions.test;

class Foo{
	public void f() throws IllegalMonitorStateException{
		System.out.println("Foo.f()");
	}
}
class Bar extends Foo{
public void f() throws RuntimeException{
	System.out.println("Bar.f()");
	}
}

abstract class Mkor{
	public void ffff(){
		System.out.println("Fff");
	}
}
public class IllegamMonitorState {

	public static void main(String[] args){
		Foo f = new Bar();
		f.f();
	}
}
