package com.tcs.exceptionhandling.unchecked;

public class UnCheckedExceptionDemo {
	public static void main(String[] args) {
		User user = new User();
		user.age = 61;
		user.work();
	}
}

class User{
	int age = 10;
	public void work() {
		if(age<=18) {
			throw new UnderAgeException("No child labour");
		}
		else if (age >60) {
			throw new OverAgeException("age should not be greater than 60 years");
		}
	}
}