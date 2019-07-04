package com.itp.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.itp.spring.model.User;

public class UserDaoImpl implements UserDao {

	private JdbcTemplate jdbcTemplate;

	public UserDaoImpl(DataSource dataSource) {
		super();
		this.jdbcTemplate = new JdbcTemplate(dataSource);
		System.out.println("jdbcTemplated is prepared..." + jdbcTemplate);
	}

	@Override
	public void saveUser(User user) {
		String query = "insert into users values(?,?,?)";
		jdbcTemplate.update(query, new Object[] { user.getId(), user.getUname(), user.getPasswd() });
		System.out.println("User is saved.");
	}

	@Override
	public List<User> getAllUsers() {
		List<User> users = jdbcTemplate.query("select * from users", new UserRowMapper());
		return users;
	}

	class UserRowMapper implements RowMapper<User> {
		@Override
		public User mapRow(ResultSet rs, int arg1) throws SQLException {
			User user = new User(rs.getInt(1), rs.getString(2), rs.getString(3));
			return user;
		}
	}

}
