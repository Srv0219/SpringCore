package com.springcore.beanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("file:src\\main\\java\\com\\springcore\\beanscope\\stereoconfig.xml");
		Student st = (Student)context.getBean("ob",Student.class);
		System.out.println(st.hashCode());
		Student st2 = (Student)context.getBean("ob",Student.class);
		System.out.println(st2.hashCode());
		
		
		Teacher t1 = (Teacher)context.getBean("teacher",Teacher.class);
		Teacher t2 = (Teacher)context.getBean("teacher",Teacher.class);
		
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		
		
	}

}
