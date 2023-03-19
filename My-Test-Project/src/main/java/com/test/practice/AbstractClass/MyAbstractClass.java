package com.test.practice.AbstractClass;

public abstract class MyAbstractClass {
	String s;
	
	private void add(int a, int b) {
		System.out.println(a+b);
	}

	protected abstract void get(String url);
}
