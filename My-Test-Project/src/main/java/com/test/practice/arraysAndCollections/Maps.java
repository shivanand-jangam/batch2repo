package com.test.practice.arraysAndCollections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		Map<Integer, String> map1 = new HashMap<>();

		map1.put(1, "Shiva");
		map1.put(2, "Sridhar");
		map1.put(3, "Srikanth");
		map1.put(3, "Srikanth");
		map1.put(3, null);
		map1.put(4, null);
		map1.put(5, null);
		map1.put(null, "abc");
		map1.put(null, "xyz");
		map1.put(null, "abc");
		map1.put(null, "33333333");

		System.out.println(map1);
		System.out.println(map1.get(null));

	}

	public static void main1(String[] args) {

		Map<Integer, String> map1 = new Hashtable<>();

		map1.put(1, "Shiva");
		map1.put(2, "Sridhar");
		map1.put(3, "Srikanth");
		map1.put(10, "dsvwdvsdv");

		System.out.println(map1);
		System.out.println(map1.get(10));

	}

}
