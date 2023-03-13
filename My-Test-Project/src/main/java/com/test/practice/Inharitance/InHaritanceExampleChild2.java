package com.test.practice.Inharitance;

public class InHaritanceExampleChild2 extends InHaritanceExampleParent{

	public static void main(String[] args) {
		InHaritanceExampleChild2 child = new InHaritanceExampleChild2();
		System.out.println("From Parent: "+child.parentProperty()/3);


		int parentProperty=100;
		System.out.println("Calculated: "+parentProperty/3);
	}

	
}
