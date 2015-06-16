package com.hdfs.io;

import static org.junit.Assert.*;

import org.junit.Test;

public class FileSystemCatTest {

	@Test
	public void testFileCat() {
		try {
			new FileSystemCat().fileCat("/usr/vic/input/eclipse.ini");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void fileDoubleCat(){
		try {
			//new FileSystemCat().fileDoubleCat("/usr/vic/input/core-site.xml");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
