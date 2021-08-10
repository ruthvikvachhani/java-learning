package com.tcs.entity;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder sb = new StringBuilder("TCS");
		sb.append(", Bangalore"); // sb in heap "TCS" and ", Bangalore" in string pool
//		String s1 = "TCS"; //string pool
//		String s2 = new String("TCS"); // heap
//		String s3 = s1 + s2; //heap
//		System.out.println(sb);

	}

}
