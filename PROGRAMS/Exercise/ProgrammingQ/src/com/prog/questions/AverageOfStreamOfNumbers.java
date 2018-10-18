package com.prog.questions;

import java.util.Arrays;
import java.util.List;

public class AverageOfStreamOfNumbers {

	static void test(){
		List<Integer> stream = Arrays.asList(10,20,30,40,50,60);
		steamAverage(stream);
  }
	
	static double getAverage(double prevAvg, int nextNumber, int totalNumbers){
		return (prevAvg*totalNumbers+nextNumber)/(totalNumbers+1);
		
	}
	
	static void steamAverage(List<Integer> stream){
		double avg = 0.0;
		int i = 0;
		for(Integer t:stream){
		    avg = getAverage(avg, t, i++);
			System.out.println(avg);
			
		}
		
	}
}
