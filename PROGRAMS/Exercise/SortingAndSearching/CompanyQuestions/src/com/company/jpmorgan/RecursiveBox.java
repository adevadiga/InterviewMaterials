package com.company.jpmorgan;

import java.util.ArrayList;
import java.util.List;

class Box{
	List<Box> innerBoxes = new ArrayList<Box>();
	
	public void addBox(Box b){
		innerBoxes.add(b);
	}
	public int getTotalInnerBox(){
		if(this == null){
			return 0;
		}
		int totalBox = innerBoxes.size();
		for(Box b : innerBoxes){
			totalBox += b.getTotalInnerBox();
		}
		return totalBox;
	}
}
public class RecursiveBox {

	public static void main(String[] args){
		Box outer = new Box();
		
		Box inner1 = new Box();
		inner1.addBox(new Box());
		inner1.addBox(new Box());
		
		Box inner2 = new Box();
		inner2.addBox(new Box());
		inner2.addBox(new Box());
		inner2.addBox(new Box());
		
		outer.addBox(inner1);
		outer.addBox(inner2);
		
		System.out.println(inner2.getTotalInnerBox());
		System.out.println(outer.getTotalInnerBox());
	}
}
