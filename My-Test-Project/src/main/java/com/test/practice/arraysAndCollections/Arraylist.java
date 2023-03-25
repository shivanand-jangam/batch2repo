package com.test.practice.arraysAndCollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class Arraylist {

	public static void main1(String[] args) {
		List list = new ArrayList();
		list.add(1);
		list.add("Shiva");
		list.add(true);
		list.add('c');
		System.out.println(list);

		List<String> list2 = new ArrayList<>();
		list2.add("Shiva");
		list2.add("Shiva");
		list2.add(null);
		list2.add(null);
		list2.add(null);
		list2.add(null);
		System.out.println(list2);
	}

	public static void main2(String[] args) {
		List<String> list2 = new ArrayList<>();
		list2.add("Shiva");
		list2.add("Sridhar");
		list2.add("Srikant");
		list2.add("Srikant");
		System.out.println(list2.get(2));
	}

	public static void main4(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Shiva");
		set.add("Sridhar");
		set.add("Srikant");
		set.add("Srikant");
		System.out.println(set);
		  // Displaying HashMap
        Iterator<String> new_Iterator  =set.iterator();
	}

	public static void main(String[] args) {
		String s1 = new String("Shiva");
		String s2 = new String("Shiva");

		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("This is equals If Condition");
		} else {
			System.out.println("This is  in equals Else condition");
		}

		if (s1 == s2) {
			System.out.println("This is ==  If Condition");
		} else {
			System.out.println("This is in == Else condition");
		}

	}

}
