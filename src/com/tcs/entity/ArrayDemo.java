package com.tcs.entity;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		int[] numbers = new int[10];
		numbers[0] = 1;
		numbers[1] = 2;
		Arrays.sort(numbers, 0, numbers.length);
//		System.out.println(numbers);
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}

	}

}
