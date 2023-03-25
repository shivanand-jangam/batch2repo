package com.test.practice.thisAndSuper;

public class ChildClass extends ParentClass {

	// this and super constructors
	ChildClass() {
		super("Shiva");
	}

	ChildClass(String a) {
		this();
		System.out.println("This is Child class Constructor: ");
	}

	public static void main(String[] args) {
		ChildClass childClass = new ChildClass("This");
	}

}
