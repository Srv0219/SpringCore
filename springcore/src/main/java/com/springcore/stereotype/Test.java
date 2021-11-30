package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("file:src\\main\\java\\com\\springcore\\stereotype\\stereoconfig.xml");
		Student st = (Student)context.getBean("ob",Student.class);
		System.out.println(st);
	}

}
