package com.spring.jdbc;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 System.out.println("Server started");
    	 
    	 //For Xml
      // ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
      
    	 
    	 //For java class
    	 ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
    	 
    	 
		/*
		 * JdbcTemplate jdbcTemplate=
		 * context.getBean("jdbcTemplate",JdbcTemplate.class); //insert String
		 * query="insert into student(id,name,city) values(?,?,?)"; //fire query int
		 * result= jdbcTemplate.update(query,3,"Anudeep Kadambala","Kharagpur");
		 */
    
       StudentDao studentDao =
    			  context.getBean("studentDao",StudentDao.class);
       
       
       
		/*
		 * 1.insert Student student = new Student(); student.setId(4);
		 * student.setName("Sagar Rout"); student.setCity("Rourkela"); int store =
		 * studentDao.insert(student);
		 * System.out.println("number of rows inserted.."+store);
		 */
       
		/* 2.update
		 * Student student = new Student(); student.setId(2);
		 * student.setName("Adhish Babuta"); student.setCity("Rourkela"); int store
		 * =studentDao.update(student); System.out.println(
		 * student.getId()+"updated"+store);
		 */
       
       
		/* 3.delete
		 * Scanner sc = new Scanner(System.in); studentDao.delete(sc.nextInt());
		 * 
		 * System.out.println("row deleated");
		 */
       
		/* 4.display single column
		 * Student student= studentDao.getStudent(1); System.out.println(student);
		 * 
		 */
       
List<Student> students= studentDao.getAllStudent(); 
       
       for(Student s:students) {
    	   System.out.println(s);
       }
     }
}


