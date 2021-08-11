package com.tcs.exceptionhandling.unchecked;

public class OverAgeException extends RuntimeException {
	public OverAgeException(String message) {
		super(message);
	}
}
