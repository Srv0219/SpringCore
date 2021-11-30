package com.springcore.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/com/springcore/autowire/annotation/annoconfig.xml");
            Employee emp =context.getBean("employee",Employee.class);
            System.out.println(emp);	
	
	} 

}
