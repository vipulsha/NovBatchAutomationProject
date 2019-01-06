package com.google.gmail;

public class UserDefinedException extends Exception {

	String message;
	
	public UserDefinedException(String m) {
		this.message = m;
	}
	
	@Override
	public String getMessage() {
		return this.message;
	}
	
	public static void main(String[] args) {
		try {
			throw new UserDefinedException("this is my exception");
		} catch (UserDefinedException e) {
			System.out.println(e.getMessage());
		}
	}
}
