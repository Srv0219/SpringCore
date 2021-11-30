package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/com/springcore/lifecycle/ciconfig.xml");
		context.registerShutdownHook();
		
                 Samosha sam = (Samosha)context.getBean("samosha");	
                 System.out.println(sam);
                   
                 System.out.println("---------------------------");
                 
                 Pepsi pep = (Pepsi)context.getBean("pepsi");              
                 System.out.println(pep);
                 
                 System.out.println("---------------------------");
                 
                 Example ex = (Example)context.getBean("example");              
                 System.out.println(ex);
	}

}
