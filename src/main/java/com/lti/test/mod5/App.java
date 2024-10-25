package com.lti.test.mod5;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Project started!");

		BeanFactory bf = new ClassPathXmlApplicationContext("com/lti/test/mod5/config5.xml");
		Student student = bf.getBean("myStudent",Student.class);
		System.out.println(student);
		System.out.println("Project Ended!");

	}
}
