package com.tcs.exceptionhandling.unchecked;

public class UnderAgeException extends RuntimeException{
	public UnderAgeException(String message) {
		super(message);
	}
}
