package com.itp.fh;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {

		
		File file = new File("/home/sunil/lines.txt");
		
		//File file = new File("D:\\javaprogram\\lines.txt"); -> Windows
		
		System.out.println(file.canRead());
		System.out.println(file.length() +" bytes");
		System.out.println(file.exists());
		System.out.println(file.getParent());
		System.out.println(file.isFile());
		System.out.println(file.isHidden());
	}
}
