package com.test.practice.Inharitance;

public class InHaritanceExampleChild3 extends InHaritanceExampleParent{

	public static void main(String[] args) {
		InHaritanceExampleChild3 child = new InHaritanceExampleChild3();
		System.out.println("From Parent: "+child.parentProperty()/3);
		
		int parentProperty=100;
		System.out.println("Calculated: "+parentProperty/3);
	}

	
}
