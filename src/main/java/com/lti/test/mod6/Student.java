package com.lti.test.mod6;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Student {

	@PostConstruct
	public void verify() {
		System.out.println("Student is verified");
	}
	
	public void print(String name) {
		System.out.println("Name is "+name);
	}
	
	@PreDestroy
	public void delete() {
		System.out.println("The student is removed from stack");
	}

	@Override
	public String toString() {
		return "Student []";
	}
	
	

}
