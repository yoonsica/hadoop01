package com.hdfs.io;

import static org.junit.Assert.*;

import org.junit.Test;

public class FileSystemCatTest {

	@Test
	public void testFileCat() {
		try {
			new FileSystemCat().fileCat("hdfs://localhost:9000/user/vic/input/core-site.xml");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void fileDoubleCat(){
		try {
			new FileSystemCat().fileDoubleCat("hdfs://localhost:9000/usr/vic/input/core-site.xml");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
