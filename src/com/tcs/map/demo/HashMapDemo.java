package com.tcs.map.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapDemo {
	public static void main(String[] args) {
//		createHashMap();
		treeMap();
	}

//	private static void treeMap() {
//		Map<Integer, Float> mathscores = new TreeMap<Integer, Float>();
//		for (int i = 0; i < 20; i++) {
//			mathScore.put("student"+i,100*math.random());
//		}
//		
//	}

	private static void createHashMap() {
		Map<String, Marks> mathScore = new HashMap<String, Marks>();
		for (int i = 0; i < 20; i++) {
			Marks marks = new Marks();
			marks.setMaths((float) ( 100*Math.random()));
			marks.setBiology((float) (100*Math.random()));
			marks.setPhysics((float) (100*Math.random()));
			mathScore.put("student"+i, marks);
		}
		boolean exists = mathScore.containsKey("student1");
		System.out.println(exists);
//		System.out.println(mathScore);
//		mathScore.put("student1", mathScore.get("student1").setBiology(12f));
		mathScore.remove("student1");
	}
}
