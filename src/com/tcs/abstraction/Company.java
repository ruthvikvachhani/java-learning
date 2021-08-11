package com.tcs.abstraction;

public class Company {
	public static void main(String[] args) {
		Staff staff = new HR();
		staff.work();
		Staff staff1 = new Gaurd();
		staff1.work();
	}
}
