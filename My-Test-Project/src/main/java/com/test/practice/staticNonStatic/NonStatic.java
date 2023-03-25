package com.test.practice.staticNonStatic;

public class NonStatic {
	
	String name="Shiva";
	
	public void printMyName() {
		System.out.println("My Name is Shiva");
	}
	
	public static void main(String[] args) {
		
		NonStatic nonStatic= new NonStatic();
		
		System.out.println(nonStatic.name);
		
		nonStatic.printMyName();
		
		
		
	}

}
