package com.tcs.entity;

public class StaticDemo {

	public static void main(String[] args) {
		Bank bank = new Bank();
		System.out.println(Bank.createNewAccountNumber());
		System.out.println(Bank.createNewAccountNumber());
		System.out.println(bank.instanceVariable);
		System.out.println(Bank.createNewAccountNumber());
		System.out.println(Bank.createNewAccountNumber());
		System.out.println(bank.instanceVariable);
	}
}

class Bank{
	static int counter; // static variable same for all object
	int instanceVariable = 10; // instance variable different for individual object
	
	public static int createNewAccountNumber()
	{
		return ++counter;
	}
}
