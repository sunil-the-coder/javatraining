package com.itp.threads;

import java.io.File;

public class FileWatcherTest {

	public static void main(String[] args) {

		File file = new File("/home/sunil/txtFiles");

		File[] files = file.listFiles();
		
		for (File f : files) {
			FileWatcher fw = new FileWatcher(f.getAbsolutePath(),"sunil");
			Thread t = new Thread(fw);
			t.start();
		}

	}
}
