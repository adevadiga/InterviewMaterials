package com.absurd.meaning;

import java.math.BigDecimal;
import java.util.Set;
import java.util.TreeSet;

public class BigDecimalInSideSortedCollection {

	public static void main(String[] args){
		Set<BigDecimal> s = new TreeSet<BigDecimal>();
		BigDecimal b1 = new BigDecimal("6.0");
		b1.setScale(2);
		s.add(b1);
		BigDecimal b2 = new BigDecimal("6.00");
		b2.setScale(1);
		s.add(b2);
		System.out.println(b1.equals(b2));
		BigDecimal b3 = new BigDecimal("7");
		b3.setScale(2);
		s.add(b3);
		
		System.out.println(s);
	}
}
