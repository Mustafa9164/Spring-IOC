package com.lti.test.mod9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ShapeApp {
	
	@Qualifier(value = "square")//Spring will select the bean specified by @Qualifier over the one marked with @Primary.
	@Autowired
	Shape shape;
	
	public void printShape() {
		shape.print();
	}

}
