package com.javaquestions.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListTesting {

	public static void main(String[] args) {
		/*List<Integer> l = new ArrayList();
		l.add(1);l.add(2);l.add(3);
		Iterator<Integer> it = l.iterator();
		while(it.hasNext()){
			l.set(0, 100);//You can use set method while accessing LIst
			System.out.println(it.next());
			//l.add(67);//Here Concurrent Mod Exception
		}

		
		List<Integer> copy = new CopyOnWriteArrayList<Integer>();
		copy.add(100);
		copy.add(200);
		Iterator<Integer> it3 = copy.iterator();
		while(it3.hasNext()){
			//l.set(0, 100);//You can use set method while accessing LIst
			
			//it3.remove();
			copy.add(67);//Here Concurrent Mod Exception
			System.out.println(it3.next());
			
			
		}
		
		int[] a = {1,2,3};
		int[] b = a;
		b[2]=100;
		foo(a);
		System.out.println(Arrays.toString(a));
  
		System.out.println(copy);*/
		
		List<Integer> ls = new ArrayList<>();
		ls.add(1);ls.add(2);ls.add(3);
		ListIterator<Integer> lsIter = ls.listIterator();
		while(lsIter.hasNext()){
			//System.out.println(lsIter.next());
			int e = lsIter.next();
			System.out.println(e);
			lsIter.set(10+e);
			System.out.println(lsIter.nextIndex());
		}
		System.out.println(ls);
		
	}
	
	static void foo(int[] a){
		int[] b = a;
		b[0]=-1;
	}

}
