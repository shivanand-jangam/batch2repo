package com.test.practice.encapsulation;

public class MainTest {

	public static void main(String[] args) {
		PrivateTest privateTest = new PrivateTest();

		System.out.println(privateTest.getStudentName());
		System.out.println(privateTest.getStudentRollNumber());

		System.out.println("===========================");

		privateTest.setStudentName("Sridhar");
		privateTest.setStudentRollNumber(2);

		System.out.println(privateTest.getStudentName());
		System.out.println(privateTest.getStudentRollNumber());

		System.out.println("===========================");

		privateTest.setStudentName("Srikanth");
		privateTest.setStudentRollNumber(3);

		System.out.println(privateTest.getStudentName());
		System.out.println(privateTest.getStudentRollNumber());

	}
}
