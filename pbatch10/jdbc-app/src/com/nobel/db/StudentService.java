package com.nobel.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import com.nobel.model.Student;

public class StudentService {

	public Student getStudentById(int id) {

		Student student = null;

		Connection conn = DBConnection.getConnection();

		try (PreparedStatement ps = conn.prepareStatement("select * from student where id=" + id + "");
				ResultSet rs = ps.executeQuery();) {

			while (rs.next()) {
				student = prepareStatement(rs);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return student;
	}

	public List<Student> getAllStudents() {

		List<Student> students = new LinkedList<Student>();
		Connection conn = DBConnection.getConnection();

		try (PreparedStatement ps = conn.prepareStatement("select * from student"); ResultSet rs = ps.executeQuery();) {

			while (rs.next()) {
				students.add(prepareStatement(rs));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return students;
	}

	private Student prepareStatement(ResultSet rs) throws SQLException {
		return new Student(rs.getInt("id"), rs.getString("name"), rs.getString("phone"));
	}

	public boolean deleteStudentById(int id) {
		Connection conn = DBConnection.getConnection();

		boolean isDeleted = false;

		try (PreparedStatement ps = conn.prepareStatement("delete from student where id=" + id + "");) {

			int res = ps.executeUpdate();
			if (res >= 1)
				isDeleted = true;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return isDeleted;
	}
}
