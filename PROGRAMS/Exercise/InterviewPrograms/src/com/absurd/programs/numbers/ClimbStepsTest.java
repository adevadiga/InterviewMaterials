package com.absurd.programs.numbers;



import org.junit.Assert;
import org.junit.Test;


public class ClimbStepsTest {

	@Test
	public void testClimbStep(){
		ClimbSteps obj = new ClimbSteps();
		Assert.assertEquals(1, obj.ways(1));
		Assert.assertEquals(2, obj.ways(2));
		Assert.assertEquals(5, obj.ways(4));
	}
}
