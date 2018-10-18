package com.prog.questions.waterTransfer;

public class CompareToFunctionTest implements Comparable<CompareToFunctionTest>{

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int hashCode(){
		return 5;
	}
	
	public boolean equals(Object o){
		if(this == o){
			return true;
		}
		if(o == null){
			return false;
		}
		
		if(o instanceof CompareToFunctionTest){
			CompareToFunctionTest another = (CompareToFunctionTest) o;
			
		return name.equals(another.getName());
		}
		
		return false;
	}
	@Override
	public int compareTo(CompareToFunctionTest o) {
		return getName().compareTo(o.getName());
	}
	
	
}
