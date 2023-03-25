package com.test.practice.thisAndSuper;

public class ChildClassVaribales extends ParentClass {
	// this and Super class variables
	String name = "Nand";

	// String name1=super.name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void printMyName() {
		super.printMyName1();
		System.out.print(super.name);
		System.out.println(name);
	}

	// public static void printMyName2() {
	// System.out.print(super.name);
	// System.out.println(name);
	// }

	public static void main(String[] args) {
		ChildClassVaribales childClass = new ChildClassVaribales();
		childClass.printMyName();
	}
}
