package com.tcs.entity;

import java.util.ArrayList;
import java.util.List;

public class Gymnasium {

	static List<User> users = new ArrayList<>();
	public static void main(String[] args) {
		createUsers();	
	}
	private static void createUsers() {
		for(int i = 0; i<10 ; i++)
		{
			User u1 = new User("Ruthvik",9876543210L,(byte)21);
			u1.setName(u1.getName() + i);
			u1.setAge((byte) (u1.getAge() * i));
			users.add(u1);
		}
		System.out.println(users.toString());
		users.get(0).workout();
	}
	
}
