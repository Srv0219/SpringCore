package com.spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entities.Student;

public class StudentDao {
	
	private HibernateTemplate hibernateTemplate;
	
	
	//Create data
	@Transactional
	public int insert(Student student) throws Exception {
		
		Integer i=(Integer) this.hibernateTemplate.save(student);
		return i;	
	}
	
	//Read SingleData
	public Student getStudent(int studentId) throws Exception {
		Student student = this.hibernateTemplate.get(Student.class, studentId);
		return student;
		
	}
	
	//Read all rows
	public List<Student> getAllStudents() throws Exception {
		List<Student> student= this.hibernateTemplate.loadAll(Student.class);
		return student;
	}
	
	//Delete Data
	@Transactional
	public void deleteStudent(int studentId) {
		Student student = this.hibernateTemplate.get(Student.class, studentId);
		try {
			 this.hibernateTemplate.delete(student);
		} catch (Exception e) {
			System.out.println("Delete"+e);
		}
	}
	
	//Update Data
	@Transactional
	public void updateStudent(Student student) {
		try {
			this.hibernateTemplate.update(student);
		} catch (Exception e) {
			System.out.println("Update"+e);
		}	
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	

}
