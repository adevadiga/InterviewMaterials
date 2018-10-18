package com.vishram.questions;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapTest {

	public static void main(String[] args) {
		
		Map<String, Integer> weak = new WeakHashMap<String, Integer>();
		String s = new String("anoop");
		weak.put(s, 100);
		String s2 = "monalisa";
		weak.put(s2, 200);
		s = null;
		Runtime runtime = Runtime.getRuntime();
		runtime.gc();
		
		String h = "hashing Test";
		System.out.println(weak.get("anoop"));
		System.out.println(weak.get("monalisa"));
		
	}

}
