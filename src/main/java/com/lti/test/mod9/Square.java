package com.lti.test.mod9;

import org.springframework.stereotype.Component;

@Component
public class Square implements Shape{

	public void print() {
		System.out.println("It has 4 sides");
	}

}
