package com.itp.searcheng;

import java.io.BufferedReader;
import java.io.File;
import java.io.FilenameFilter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Application {

	public static void main(String[] args) {

		if (args.length != 2) {
			System.out.println("Usage: java Application <searchDir> <searchString>");
			System.exit(1);
		} else {

			// 1. Retrieve all java files from given directory.
			File dir = new File(args[0]);
			File[] files = dir.listFiles(new FilenameFilter() {
				@Override
				public boolean accept(File arg0, String fname) {
					return fname.endsWith(".txt");
				}
			});

			// 2. Search given content in each and every file.
			ExecutorService service = Executors.newFixedThreadPool(8);
			
			for (File file : files) {
				service.submit(new SearchEngine(file, args[1]));
			}
			
			service.shutdown();
		}

	}
}
