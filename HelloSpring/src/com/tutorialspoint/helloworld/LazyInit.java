package com.tutorialspoint.helloworld;

public class LazyInit {
	private String message;

	public void getMessage() {
		System.out.println("Your Message: " + message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
