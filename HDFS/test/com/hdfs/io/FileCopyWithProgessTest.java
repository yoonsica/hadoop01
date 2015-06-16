package com.hdfs.io;

import static org.junit.Assert.*;

import org.junit.Test;

public class FileCopyWithProgessTest {

	@Test
	public void testCopyFromLocal() throws Exception {
		new FileCopyWithProgess().copyFromLocal("/usr/local/eclipse/eclipse.ini", "/usr/vic/input/eclipse.ini");
	}

}
