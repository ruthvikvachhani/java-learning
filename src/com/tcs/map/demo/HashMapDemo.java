package com.tcs.map.demo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		createHashMap();
	}

	private static void createHashMap() {
		Map<String, Marks> mathScore = new HashMap<String, Marks>();
		for (int i = 0; i < 20; i++) {
			Marks marks = new Marks();
			marks.setMaths((float) ( 100*Math.random()));
			marks.setBiology((float) (100*Math.random()));
			marks.setPhysics((float) (100*Math.random()));
			mathScore.put("student"+i, marks);
		}
		System.out.println(mathScore);
	}
}
