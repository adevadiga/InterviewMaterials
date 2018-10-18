package com.lazarus.tdd;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RecordGripdTest {
	
	@Rule
	public final ExpectedException exception = ExpectedException.none();
	
	RecordGripService service = new RecordGripService();
	
	//@Test(expected=StorageException.class)
	@Test
	public void retrieveSectionShouldThrowInvalidFileName() throws StorageException {
		
		exception.expect(StorageException.class);
		service.retrieveSection("invalid-file");
		
	}

}
