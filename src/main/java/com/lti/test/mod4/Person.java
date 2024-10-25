package com.lti.test.mod4;

public class Person {
	
	private int age;
	private String salary;
	
	public Person(int age, String salary) {
		this.age = age;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", salary=" + salary + "]";
	}
	
	

}
