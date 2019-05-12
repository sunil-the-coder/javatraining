package com.itp.training;

import java.io.OutputStream;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

class Student implements Comparable<Student> {
	private int id;
	private String name;
	private int age;

	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj != null && obj instanceof Student) {
			Student s = (Student) obj;
			if (this.id == s.id && this.name.equals(s.name)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		// prime numbers
		int sHash = name.hashCode();
		return id + sHash;
	}

	@Override
	public int compareTo(Student s2) {
		return this.id - s2.id;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

}

public class Application {

	public static void main(String[] args) {

		Properties props = new Properties();
		props.setProperty("server.port", "1900");
		props.setProperty("app.name", "movie-service");

		try (OutputStream writer = 
				Files.newOutputStream(Paths.get("config.xml"))) {
			props.storeToXML(writer, "Application Settings");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Properties appProps = new Properties();
		try (Reader reader = 
				Files.newBufferedReader(Paths.get("config.properties"))) {
			appProps.load(reader);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		String port = appProps.getProperty("server.port");
		System.out.println(port);
		

		/*
		 * Map<Student, Integer> map = new HashMap();
		 * 
		 * map.put(null, 100); map.put(new Student(3, "ANIL", 25), 200); Integer
		 * oldValue = map.put(new Student(3, "GANESH", 23), 300);
		 * 
		 * System.out.println("Old value:"+oldValue); //System.out.println(map);
		 * 
		 * System.out.println(map.get(new Student(3, "ANIL", 25)));
		 */
	}
}
