package com.test.practice.Inharitance;

public class InHaritanceExampleParent {
	
	public int parentProperty() {
		System.out.println("100 acres land");
		return 200;
	}
	
	public void childsEducation() {
		System.out.println("Child B.tech Education");
	}
	
	public void childMarriege() {
		System.out.println("Childers marrieg with Selected family");
	}
	
	public int add2Number(int a , int b) {
		int c= a+b;
		System.out.println("Parent method:"+c);
		return c;
	}
	
}
