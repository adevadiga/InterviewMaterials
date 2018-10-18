package com.absurd.meaning;

import java.util.Collections;
import java.util.List;

class Foo{
	
}
public class ObjectToList {

	public static void main(String[] args) {
	
		List<Foo> l = Collections.singletonList(new Foo());
		//l.add(new Foo());  //Wont work
		System.out.println(l);
		
		System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MIN_VALUE > 0) ;
		
		System.out.println(1.0/0.0);
		
		
		int a  = Integer.MAX_VALUE;
		int b = Integer.MIN_VALUE;
		System.out.println(a-b);
	}

}
