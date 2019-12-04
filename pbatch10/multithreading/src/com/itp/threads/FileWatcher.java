package com.itp.threads;

import java.io.FileReader;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class FileWatcher implements Runnable {

	private String fileName;
	private String content;

	public FileWatcher(String fileName, String content) {
		super();
		this.fileName = fileName;
		this.content = content;
	}

	@Override
	public void run() {
	
		System.out.println("Searching " + content + " into " + fileName);
		
		try (Scanner fr = new Scanner(new FileReader(fileName));) {
			String line = "";

			while ((line = fr.nextLine()) != null) {
				if (line.indexOf(content) > -1)
					System.out.println(line);
			}

		} catch (NoSuchElementException e) {

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
