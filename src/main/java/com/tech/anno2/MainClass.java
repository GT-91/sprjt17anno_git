package com.tech.anno2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
	public static void main(String[] args) {
//		ApplicationContext context =
//				new ClassPathXmlApplicationContext("com/tech/anno2/beans.xml");
		ApplicationContext context =
				new AnnotationConfigApplicationContext(CollegeConfig.class);
		System.out.println("beans.xml file loaded");
		College college = context.getBean("college", College.class);
		System.out.println("this obj: " + college);
		college.test();
	}
}
