package com.lti.test.mod5;

import java.util.List;

public class Student {

	private String name;
	private List<String> subjects;

	public Student(String name, List<String> subjects) {
		this.name = name;
		this.subjects = subjects;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", subjects=" + subjects + "]";
	}

}
