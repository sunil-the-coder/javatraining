package com.spatil.examples;

public class Student {

	private int rollNo;
	private String name;
	private double percentage;

	public Student(int rollNo, String name, double percentage) {
		this.rollNo = rollNo;
		this.name = name;
		this.percentage = percentage;
	}

	public String toString() {
		return "Roll:" + rollNo + ",Name:" + name + ",Percentage:" + percentage;
	}

	public static void sortStudents(Student[] studs) {

		for (int i = 0; i < studs.length; i++) {
			for (int j = i + 1; j < studs.length; j++) {
				if (studs[i].percentage > studs[j].percentage) {
					
					//Sort complete object rather than field by field
					Student temp = studs[i];
					studs[i] = studs[j];
					studs[j] = temp;
				}
			}
		}
	}

}
