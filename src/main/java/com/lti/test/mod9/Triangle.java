package com.lti.test.mod9;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class Triangle implements Shape{

	public void print() {
		System.out.println("It Has 3 sides");
	}

}
