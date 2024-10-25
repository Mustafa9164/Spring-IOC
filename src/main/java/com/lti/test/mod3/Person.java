package com.lti.test.mod3;

public class Person {
	
	private Mobile mobile;

	public Mobile getMobile() {
		return mobile;
	}

	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Person [mobile=" + mobile + "]";
	}
	

}
