package com.itp.fh;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {

		try {

			FileReader fr = new FileReader("/home/sunil/lines.txt");

			int v = -1;
			while ((v = fr.read()) != -1) {
				System.out.print((char) v);
			}

			fr.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		try {

			FileWriter fw = new FileWriter("/home/sunil/lines1.txt");
			fw.write("this is sunil from java program");
			fw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
