package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entity.Student;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int insert(Student student) {
		
		 String query="insert into student(id,name,city) values(?,?,?)";
		 int r= this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		return r;
	}
	
	public int update(Student student) {
		 String query="update student set name=? , city=?  where id=?";
		 int r= this.jdbcTemplate.update(query,student.getName(),student.getCity(),student.getId());
		return r;
	}
	
	public int delete(int studentID) {
		 String query="delete from student where id=?";
		 int r= this.jdbcTemplate.update(query,studentID);
		return r;
	}
	
	public Student getStudent(int studentID) {
		 String query="select * from student where id=?";
		 
		 RowMapper<Student> rowMapper = new RowMapperImpl();
		 Student student= this.jdbcTemplate.queryForObject(query, rowMapper,studentID);
		return student;
	}
	
	public List<Student> getAllStudent() {
		String query="select * from student";
		 List<Student> student= (List<Student>) this.jdbcTemplate.query(query, new RowMapperImpl());
		return student;
	}

	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
}
