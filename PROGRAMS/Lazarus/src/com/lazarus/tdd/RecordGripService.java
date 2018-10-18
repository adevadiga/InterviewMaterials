package com.lazarus.tdd;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class RecordGripService {

	public List<RecordGrip> retrieveSection(String fileName) throws StorageException
	{
		try{
			FileInputStream fis = new FileInputStream(fileName);
			fis.close();
		}catch(Exception e)
		{
			throw new StorageException("Storage exception", e);
		}
		return new ArrayList<RecordGrip>();
	}
}

