package com.absurd.programs.misc;

import org.junit.Test;

public class RunTimeExceptionTestTest {

	@Test
	public void testNPE(){
		RunTimeExceptionTest ref = null;
		new RunTimeExceptionTest().testNPECatchBehavior(ref);
	}
}
