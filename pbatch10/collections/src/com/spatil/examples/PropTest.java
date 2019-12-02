package com.spatil.examples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropTest {

	public static void main(String[] args) {

		Properties props = new Properties();
		props.setProperty("username", "sunil");
		props.setProperty("password", "sunil");
		props.setProperty("email", "sunil@gmail.com");

		// 1. How to write props to file ?
		try {
			FileOutputStream fos = new FileOutputStream("config.properties");
			props.store(fos, "Added user configuration");

			System.out.println("Properties has been written on disk");

		} catch (Exception e) {
			e.printStackTrace();
		}

		// 2. How to read from properties file into Properties class object
		Properties propsFromFile = new Properties();

		try {
			FileInputStream fis = new FileInputStream("config.properties");
			propsFromFile.load(fis);
			
			System.out.println(propsFromFile.getProperty("username"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
