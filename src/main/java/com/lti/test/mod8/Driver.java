package com.lti.test.mod8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(ConfigurationClass.class);
		Person person = ac.getBean("person",Person.class);
		System.out.println(person.getMobile().getNumber());
		System.out.println(person.getName());
		System.out.println(person.getAge());
		person.getMobile().videoCall();
		person.getMobile().videoCall();
	}

}
