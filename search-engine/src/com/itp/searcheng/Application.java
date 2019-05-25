package com.itp.searcheng;

import java.io.BufferedReader;
import java.io.File;
import java.io.FilenameFilter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Application {

	public static void main(String[] args) {

		if (args.length != 2) {
			System.out.println("Usage: java Application <searchDir> <searchString>");
			System.exit(1);
		} else {
			// System.out.println(args[0]);
			// System.out.println(args[1]);

			// 1. Retrieve all java files from given directory.

			File dir = new File(args[0]);
			File[] files = dir.listFiles(new FilenameFilter() {
				@Override
				public boolean accept(File arg0, String fname) {
					return fname.endsWith(".txt");
				}
			});

			// 2. Search given content in each and every file.
			for (File file : files) {
				Thread t = new Thread(new SearchEngine(file, args[1]));
				t.start();
			}
		}

	}
}
