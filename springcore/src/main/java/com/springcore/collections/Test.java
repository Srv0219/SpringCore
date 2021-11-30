package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
	ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/com/springcore/collections/collectionconfig.xml");
	Employee employee1=(Employee)context.getBean("emp1");
	System.out.println(employee1.getName());
	System.out.println(employee1.getPhones());
	System.out.println(employee1.getAdresses());
	System.out.println(employee1.getCourses());
	
	
	}

}
