package com.absurd.meaning;

class  Bar{
	
}
public class ConstructorOverloading {

	ConstructorOverloading(Object o){
		System.out.println("Object args called");
	}
    ConstructorOverloading(String s){
    	System.out.println("String args called");
	}
    ConstructorOverloading(int i){
    	System.out.println("int args called");
	}
    
    ConstructorOverloading(Bar i){
    	System.out.println("Foo args called");
	}
    
    public String getDescription(Object obj){
    	   return obj.toString();
    }
    public String getDescription(String obj){
    	   return obj;
    }
    public void getDescription(String obj){
    	   return obj;
    }    	
    public static void main(String[] args){
    	//new ConstructorOverloading(null);
    	Double d = new Double("122");
    	new ConstructorOverloading(d);
    }
}
