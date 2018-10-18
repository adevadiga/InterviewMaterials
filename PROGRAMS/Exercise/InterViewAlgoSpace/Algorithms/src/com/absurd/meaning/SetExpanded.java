package com.absurd.meaning;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SetExpanded {

	
	public static void main(String[] args){
	    Set params = new HashSet(){
			{
			    	add("a1");			
			        add("a2");
			}
		};
		
		System.out.println(params);
		HashMap<String, Integer> m =new HashMap<String, Integer>();
		m.put("Anoop",100);
		m.put("Shreta", 200);
		System.out.println(m);
		
		
		String one = "hello";
		String two = new StringBuilder("hello").toString();
		if(one == two){
			System.out.println("Equals");
		}
	}
}
