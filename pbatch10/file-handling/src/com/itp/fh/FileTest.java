package com.itp.fh;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {

	public static void copyFile(String srcFile, String destFile) {

		try (FileReader fr = new FileReader(srcFile); 
				FileWriter fw = new FileWriter(destFile);) {

			int v = -1;
			while ((v = fr.read()) != -1) {
				fw.write(v);
			}

			System.out.println("File is copied.");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		copyFile("/home/sunil/Demo.cpp", "/home/sunil/Demo2.cpp");

//		FileReader fr = null;
//
//		try {
//
//			// Resource
//			fr = new FileReader("/home/sunil/lines.txt");
//
//			int v = -1;
//			while ((v = fr.read()) != -1) {
//				System.out.print((char) v);
//			}
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//		// Close all resources in finally block
//		finally {
//			try {
//				if (fr != null)
//					fr.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//
//		FileWriter fw = null;
//
//		try {
//
//			fw = new FileWriter("/home/sunil/lines1.txt");
//			fw.write("this is sunil from java program");
//
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if (fw != null)
//					fw.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//
//		}

	}
}
