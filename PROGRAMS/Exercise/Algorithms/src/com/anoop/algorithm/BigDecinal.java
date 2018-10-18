package com.anoop.algorithm;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecinal {
 static void test(){
	 BigDecimal value = new BigDecimal("1.00000000000");
	 BigDecimal displayVal = value.setScale(2, RoundingMode.HALF_EVEN);
	 System.out.println(displayVal);
 }
}
