package com.company.jpmorgan;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Foo{
	void foo(List<String> f){
		System.out.println("parent");
	}
}
class Bar extends Foo{
	void foo(List f){
		System.out.println("child");
	}
}
public class WrittenTest {
public static void main(String[] args){
	Foo f = new Bar();
	List<String> l =new ArrayList<String>();
	List l1 = new ArrayList();
	f.foo(l1);
	
	
	//ABout increment
	int i = 0;
	i = i++ + foo(i);
	//i =  foo(i) + i++;
	//i = ++i + foo(i);
	System.out.println(i);
	
	
	Set s = new HashSet();
	for(short k=0;k<100;k++){
		s.add(k);
		s.remove(k-1);
	}
	System.out.println(s.size()); //k-1 will become Integer when u try to remove from map contianing
	//Short - equals methods return false. since instanceof fails
}

static int foo(int i){
	System.out.println(i);
	return 0;
}
	
}
