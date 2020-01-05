package com.nobel.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.nobel.spring.model.Category;

public class CategoryDao {

	private JdbcTemplate jdbcTemplate;

	public CategoryDao(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	public void save(Category category) {
		jdbcTemplate.update("insert into categories values(?,?,?,?)", new Object[] { category.getId(),
				category.getCatName(), category.getCatDesc(), category.getCatImgUrl() });

		System.out.println("Category Saved.");
	}

	public List<Category> findAll() {
		
		CategoryRowMapper rowMapper = new CategoryRowMapper();
		
		List<Category> categories = jdbcTemplate.query("select * from categories", rowMapper);
		return categories;
	}

	class CategoryRowMapper implements RowMapper<Category> {

		//callback method
		@Override
		public Category mapRow(ResultSet rs, int arg1) throws SQLException {
		//	System.out.println("Calling mapRow for "+arg1);
			Category category = new Category();
			category.setId(rs.getInt(1));
			category.setCatName(rs.getString(2));
			category.setCatDesc(rs.getString(3));
			category.setCatImgUrl(rs.getString(4));
			return category;
		}

	}
}
