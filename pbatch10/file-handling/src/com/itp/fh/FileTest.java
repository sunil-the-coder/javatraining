package com.itp.fh;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {

		File tempFile = new File("/home/sunil/tmpFolder/a/b/c");
		tempFile.mkdirs();
		
		
		File file = new File("/home/sunil/javatraining");
		
		String[] dirContents = file.list();
		
		for (String name : dirContents) {
			System.out.println(name);
		}
		
		File[] files = file.listFiles();
		
		for(File f : files) {
			System.out.println(f.getAbsolutePath());
			
			if(f.canExecute()) {
				//do somethingg....
				
			}
			
			if(f.getName().endsWith(".txt")) {
				//delete all files
				
			}
			
			
		}
		
		//File file = new File("D:\\javaprogram\\lines.txt"); -> Windows
		
		/*
		 * System.out.println(file.canRead()); System.out.println(file.length()
		 * +" bytes"); System.out.println(file.exists());
		 * System.out.println(file.getParent()); System.out.println(file.isFile());
		 * System.out.println(file.isHidden());
		 */
		
		
		
	}
}
