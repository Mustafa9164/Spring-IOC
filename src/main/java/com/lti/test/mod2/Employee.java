package com.lti.test.mod2;

import java.util.List;

public class Employee {
	
	private List<String> names;

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

	@Override
	public String toString() {
		return "Employee [names=" + names + "]";
	}

	
}
