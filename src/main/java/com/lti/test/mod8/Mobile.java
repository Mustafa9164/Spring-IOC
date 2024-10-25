package com.lti.test.mod8;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
	
	@Value("12345")
	private int number;
	
	public void voiceCall() {
		System.out.println("Voice call");
	}
	
	public void videoCall() {
		System.out.println("Video Call");
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	

}
