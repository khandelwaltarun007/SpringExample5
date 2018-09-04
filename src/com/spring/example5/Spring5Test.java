package com.spring.example5;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring5Test {
	public static final Logger log = Logger.getLogger(Spring5Test.class);
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorld world = (HelloWorld) context.getBean("helloWorld");
		world.getMessage1();
		world.getMessage2();

		HelloIndia india = (HelloIndia) context.getBean("helloIndia");
		india.getMessage1();
		india.getMessage2();
		india.getMessage3();
	}
}
