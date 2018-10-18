package com.anoop.algorithm.iface;

public class RandomInteger {

	public static void randomize(){
		new RandomInteger().randomInt();
		new RandomInteger().randomDouble();
		
	}
	
	void randomInt(){

		int r1=2,r2=9;
		double rand = Math.random();
		double d = rand*(r2-r1+1); //makes the random distribute over 9-2+1 = 8 values 0.00-7.99(i.e 7). max is 9
		double randomValInRange = (int)d+r1;//add lower boundt
		System.out.println(randomValInRange);
		
	}
	double randomDouble(){

		int r1=2,r2=9;
		double rand = Math.random();
		double d = rand*(r2-r1); //makes the random distribute over 9-2 = 6.99 values . max is 8.99
		double randomValInRange = d+r1;//add lower boundt
		System.out.println(randomValInRange);
		return randomValInRange;
				
		
	}
	
	boolean randomChance(double p)
	{
		return randomDouble()<p;//randomDouble sould pass 0 and 1 as p is between 0 and 1
	}
}
