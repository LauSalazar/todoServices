package com.rest.webservices.restfulwebservices.model;

public class AutenticationBean {

	private String message;

	public AutenticationBean(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
