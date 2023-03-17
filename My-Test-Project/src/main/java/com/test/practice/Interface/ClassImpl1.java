package com.test.practice.Interface;

import java.util.ArrayList;
import java.util.List;

public class ClassImpl1 implements InterfaceTest1, InterfaceTest2 {

	InterfaceTest2 interfaceTest1 = new ClassImpl2();

	List<String> list = new ArrayList<>();

	@Override
	public void claculateInterest() {
	}

	@Override
	public void calculateSalary() {
		System.out.println("Salary+20000");
	}
	
	public void calculateSalary1() {
		System.out.println("Salary+20000");
	}

}
