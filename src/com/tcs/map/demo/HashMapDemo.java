package com.tcs.map.demo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		createHashMap();
	}

	private static void createHashMap() {
		Map<String, Float> mathScore = new HashMap<String, Float>();
		for (int i = 0; i < 20; i++) {
//			Marks marks = new Marks();
//			marks.getMaths(i+10);
//			marks.getBiology(i+20)
//			marks.getPhysics(i+10);
			mathScore.put("student"+i,(float) (100 * Math.random()) );
		}
		System.out.println(mathScore);
	}
}
