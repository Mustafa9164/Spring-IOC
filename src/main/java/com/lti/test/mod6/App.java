package com.lti.test.mod6;

import java.applet.AppletContext;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		System.out.println("Project started!");

		ApplicationContext ac = new AnnotationConfigApplicationContext(ConfigurationClass.class);
		Student student = ac.getBean("student",Student.class);
		student.print("Mohammed");
		//downcasting
		AnnotationConfigApplicationContext c=(AnnotationConfigApplicationContext) ac;
		c.close();
		System.out.println("Project Ended!");

	}
}
