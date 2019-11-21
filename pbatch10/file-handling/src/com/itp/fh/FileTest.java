package com.itp.fh;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


class Student implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	private int age;
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return " [id=" + id + ", name=" + name + "]";
	}

}

public class FileTest {

	public static void copyFile(String srcFile, String destFile) {

		try (FileInputStream fr = new FileInputStream(srcFile); FileOutputStream fw = new FileOutputStream(destFile);) {

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
		// copyFile("/home/sunil/demo.png", "/home/sunil/demo2.png");

		// Write custom java object to file - Serialization
//		try (FileOutputStream fos = new FileOutputStream("/home/sunil/student.ser");
//				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
//
//			Student stud = new Student(10, "Sunil");
//			oos.writeObject(stud);
//
//			System.out.println("Student object stored on file..");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		// read custom java object from file - Deserialization
		try (FileInputStream fis = new FileInputStream("/home/sunil/student.ser");
				ObjectInputStream ois = new ObjectInputStream(fis);) {

			System.out.println("Reading student object back from file...");

			Object obj = ois.readObject();
			Student stud = (Student) obj;
			System.out.println(stud);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
