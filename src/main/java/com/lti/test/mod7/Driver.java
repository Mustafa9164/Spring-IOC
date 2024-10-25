package com.lti.test.mod7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(ConfigurationClass.class);
		Employee e = ac.getBean("employee", Employee.class);
		System.out.println(e.getAge());
	}

}
