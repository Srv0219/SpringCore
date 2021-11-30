package com.springcore.constructorinj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/com/springcore/constructorinj/ciconfig.xml");
		Person person=(Person) context.getBean("person");
		System.out.println(person);
		
		Addition addition=(Addition) context.getBean("add");
		addition.doSum();
		
		System.out.println();

	}

}
