package com.test.practice.staticNonStatic;

public class StaticClass extends ParentStatic{
	
	static {
	System.out.println("This is static block");	
	}
	
	static String name="Shiva";
	
	public static void printMyName() {
		System.out.println("This is my name");
	}
	
	public static void main(String[] args) {
		System.out.println(StaticClass.name);
		
		StaticClass.printMyName();
		
	}

}
