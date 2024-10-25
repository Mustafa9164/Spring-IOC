package com.lti.test.mod9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {
		
		ApplicationContext ac=new AnnotationConfigApplicationContext(ConfigurationClass.class);
		ShapeApp app = ac.getBean("shapeApp", ShapeApp.class);
		ShapeApp app1 = ac.getBean("shapeApp", ShapeApp.class);
		app.printShape();
	}
}
