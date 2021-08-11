package com.tcs.statickeyword;

public class StaticBlockDemo {
	private static int age =10;// can be private or public 
	int price =20;//cannot access in static block
	public StaticBlockDemo() {
		System.out.println("in constructor..");
	}
	static {//called first and loaded when code run startup and runs only once
		System.out.println("this is static block");
	}
	
	public static void main(String[] args) {
		StaticBlockDemo blockDemo = new StaticBlockDemo();
		new StaticBlockDemo();
	}
	void work() {
		int time =45; // local variable cannot be static
	}
}
