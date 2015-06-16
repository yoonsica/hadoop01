package com.hdfs.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class ShowFileStatusTest {
	FileSystem fs;
	@Before
	public void setUp() throws Exception {
		Configuration conf = new Configuration();
		fs = FileSystem.get(conf);
		if(!fs.exists(new Path("/dir/file"))){
			OutputStream out = fs.create(new Path("/dir/file"));
			out.write("content".getBytes("UTF-8"));
			out.close();
		}
	}

	@After
	public void tearDown() throws Exception {
		if(fs!=null)
			fs.close();
	}

	@Test(expected = FileNotFoundException.class)
	public void throwsFileNotFoundException() throws IOException {
		fs.getFileStatus(new Path("no-such-file"));
	}

	@Test
	public void fileStatusForFile() throws Exception{
		Path file = new Path("/dir/file");
		FileStatus stat = fs.getFileStatus(file);
		assertThat(stat.getPath().toUri().getPath(), is("/dir/file"));
	}
}
