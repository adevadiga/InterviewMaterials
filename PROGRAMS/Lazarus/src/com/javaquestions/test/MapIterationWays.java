package com.javaquestions.test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapIterationWays {

	public static void main(String[] args) {

      Map<String,String> m= new HashMap<>();
      m.put("lm","Lio Messi");
      m.put("vk","Virat Kohli");
      
      Iterator<Map.Entry<String,String>> it = m.entrySet().iterator();
      while(it.hasNext()){
    	  Map.Entry<String, String> entry = it.next();
    	  entry.getKey();
    	  entry.getValue();
      }
      
      for(Map.Entry<String, String> entry:m.entrySet()){
    	  entry.getKey();
    	  entry.getValue();
      }
      
      
      //1. keySet ->iterator or loop
      //2. entrySet
      //3. values
      
      Collection<String> values = m.values();

	}

}
