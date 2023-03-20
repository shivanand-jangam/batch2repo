package com.test.practice.Constructor;

public class MyClass {

	// Instance Variable
	
	// When ever you will create an object then consturcotr will automatically intialize of an object
	
	// default values for name and number is null and o
	// Constructor will replace the values with current values passed in construcotr
	
	// Purpose of Consturcotr 
	// 1. To Inistialization of an object not to create an Object
	//(new keyword is used to create an object)
	// For every object construcotr will execute seperatly
	
	//RULES
	// Name of class should be same as COnstrucot name
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	String name;
	int number;
	
	MyClass() {
		System.out.println("Defalt Constructor");
	}
	
	MyClass(String name, int number) {
		this.name = name;
		this.number = number;
	}
	
	MyClass(int number, String name) {
		this.name = name;
		this.number = number;
	}

	MyClass(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
	/*	MyClass class1 = new MyClass("Shiva", 1);
		MyClass class2 = new MyClass("Srikanth", 2);
		MyClass class3 = new MyClass("Sridhar", 3);
		System.out.println(class1.name);
		System.out.println(class2.name);
		System.out.println(class3.name);  */
		
		MyClass s1= new MyClass();
		s1.name="Bhima";
		s1.number=10;
		System.out.println(s1.name);
		System.out.println(s1.number);
		
		MyClass class4 = new MyClass("Test");
		System.out.println(class4.number);
	}

}
