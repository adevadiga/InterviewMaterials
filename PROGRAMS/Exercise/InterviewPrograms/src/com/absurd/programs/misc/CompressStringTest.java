package com.absurd.programs.misc;



import org.junit.Assert;
import org.junit.Test;

public class CompressStringTest {

	@Test
	public void testCompressString(){
		String str = "aaaabbcccd";
		String expected = "a4b2c3d";
		Assert.assertEquals(expected, new CompressString().compressString(str));
	}
}
