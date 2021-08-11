package com.tcs.exceptionhandling;

public class ExceptionsDemo {
	public static void main(String[] args) throws MyCheckedException {
		try {
			demo2();
		} catch (InavlidInputException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		}
		catch (MyCheckedException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("always called");
		}
//		demo1();
	}
	
	private static void demo2() throws MyCheckedException,InavlidInputException{
		throw new MyCheckedException();
	}
	private static void demo1() {
		try {
			System.out.println(1/0);
		} catch (ArithmeticException ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
			System.out.println("division by zero is not allowed");
		}
	}
}
