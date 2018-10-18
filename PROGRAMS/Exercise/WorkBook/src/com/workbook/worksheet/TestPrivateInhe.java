package com.workbook.worksheet;

import java.util.Arrays;

public class TestPrivateInhe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       TestPrivateInheritance t = new ChildTestPrivateInheritance();
      // t.foo();
       //System.out.println(1.0/0.0);
       String[] str = {"anoop"};
       Object[] obj = str;
       obj[0] = new StringBuilder("torres");
       System.out.println(Arrays.toString(obj));
      	}

}
