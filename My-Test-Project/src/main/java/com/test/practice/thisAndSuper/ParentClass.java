package com.test.practice.thisAndSuper;

public class ParentClass {

	String name="Shiva";
	
	ParentClass(){
		System.out.println("This is super class Consturtor");
	}
	
	ParentClass(String name){
		System.out.println("This is super class Consturtor: "+name);
	}
	
	public void printMyName1() {
		System.out.println("Super Method");
	}
	
}
