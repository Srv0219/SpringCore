package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	
    	 int id;
    	 String name;
    	 String city;
    	
    	
       ApplicationContext context= new ClassPathXmlApplicationContext("file:src/main/java/com/spring/orm/config.xml");
          StudentDao dao= context.getBean("studentDao",StudentDao.class);          
			/*
			 * Student student = new Student(); int r= dao.insert(student);
			 * System.out.println("done "+ r);
			 */
          
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
          boolean go = true;
         while(go){
             
           try {
        	   System.out.println("*****Welcome to spring orm project*****");
               System.out.println("1. Add new students");
               System.out.println("2. Display all students");
               System.out.println("3. Display a single student");
               System.out.println("4. Delete students");
               System.out.println("5. Update students");
               System.out.println("6. Exit");
               System.out.println("Please enter your choice:");
               int number = Integer.parseInt(br.readLine());
        	  
               switch (number) {
                   case 1:
                	   System.out.println("Id");
                	   id=Integer.parseInt(br.readLine());
                	   
                	   System.out.println("Name");
                	   name=br.readLine();
                	   
                	   System.out.println("City");
                	   city=br.readLine();
                	   
                	   Student student = new Student();
                	   student.setStudentId(id);
                	   student.setStudentName(name);
                	   student.setStudentCity(city);
                	   int n=dao.insert(student);
                	   System.out.println("Inserted "+ n);
              
                       break;
                   case 2:
                	   List<Student> li=  dao.getAllStudents();
               	   for(Student st : li) {
               		   System.out.println(st.toString());
               	   }
                
                       break;
                   case 3:
                	   System.out.println("Id");
                	   id=Integer.parseInt(br.readLine());
                	   Student student2 = dao.getStudent(id);
                	   System.out.println(student2.toString());
                       break;
                   case 4:
                	   System.out.println("Id");
                	   id=Integer.parseInt(br.readLine());
                	   dao.deleteStudent(id);
                	   System.out.println("Student deleated"+ id);
                       break;
                   case 5:
                	   System.out.println("Id");
                	   id=Integer.parseInt(br.readLine());
                	   
                	   System.out.println("Name");
                	   name=br.readLine();
                	   
                	   System.out.println("City");
                	   city=br.readLine();
                	   
                	   Student student3 = new Student();
                	   student3.setStudentId(id);
                	   student3.setStudentName(name);
                	   student3.setStudentCity(city);
                	   dao.updateStudent(student3);
                	   System.out.println("Updated");
                   break;
                   case 6:
                	   System.out.println("thankyou for using application");
                      go=false;
                       break;
                  
                      
               }
		} catch (Exception e) {
			System.out.println(e);
		}
      }   
    }
}
