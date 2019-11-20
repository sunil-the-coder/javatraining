package com.itp.fh;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileTest {

	public static void copyFile(String srcFile, String destFile) {

		try (FileInputStream fr = new FileInputStream(srcFile); 
				FileOutputStream fw = new FileOutputStream(destFile);) {

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

		copyFile("/home/sunil/demo.png", "/home/sunil/demo2.png");

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
