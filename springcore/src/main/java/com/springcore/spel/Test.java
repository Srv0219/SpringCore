package com.springcore.spel;

import java.beans.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("file:src\\main\\java\\com\\springcore\\spel\\stereoconfig.xml");
		Student st = context.getBean("ob",Student.class);
		System.out.println(st);
		
    SpelExpressionParser val=new SpelExpressionParser();
    org.springframework.expression.Expression expression=  val.parseExpression("22+33");
    System.out.println(expression.getValue());
		
		
		
		
	}

}
