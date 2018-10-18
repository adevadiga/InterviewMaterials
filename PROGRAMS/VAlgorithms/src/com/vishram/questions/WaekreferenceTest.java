package com.vishram.questions;

import java.lang.ref.WeakReference;
class Foo{
	int n;
	Foo(int n){
		this.n = n;
	}
	public String toString(){
		return "Foo with n "+n;
	}
}
public class WaekreferenceTest {
	
	public void weakRefRest(Foo f){
		WeakReference<Foo> weakFoo = new WeakReference<Foo>(f);
		f = null;
		Runtime rt = Runtime.getRuntime();
		rt.gc();
		System.out.println(weakFoo.get());
	}

	public static void main(String[] args) {

        String s =new String("liverpool");
		WeakReference<String> weakString = new WeakReference<String>(s);
		s = null;
		System.out.println(weakString.get());
		
		new WaekreferenceTest().weakRefRest(new Foo(1));
	}

}
