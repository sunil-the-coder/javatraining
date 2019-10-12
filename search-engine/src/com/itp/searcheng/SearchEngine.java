package com.itp.searcheng;

import java.io.BufferedReader;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class SearchEngine implements Runnable {

	private File file;
	private String searchString;

	public SearchEngine(File file, String searchString) {
		this.file = file;
		this.searchString = searchString;

	}

	@Override
	public void run() {

		//System.out.println("Searching into " + file.getAbsolutePath());
		try (BufferedReader br = Files.newBufferedReader(Paths.get(file.getAbsolutePath()))) {
			String line = "";
			int count = 1;
			while ((line = br.readLine()) != null) {
				if (line.indexOf(searchString) >= 0) {
					System.out.println(count + ":" + file.getName()+":"+line);
				}
				count++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
