package com.test.practice.Inharitance;

public class InHaritanceExampleChild extends InHaritanceExampleParent {

	public static void main(String[] args) {
		InHaritanceExampleChild child = new InHaritanceExampleChild();
		System.out.println("From Parent: "+child.parentProperty()/3);

		int parentProperty=100;
		System.out.println("Calculated: "+parentProperty/3);
		
		
	}

}
