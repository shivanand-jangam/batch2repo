package com.test.practice.encapsulation;

public class PrivateTest {

	private String studentName = "Bhima";
	private int studentRollNumber = 001;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName.toString();
	}

	public int getStudentRollNumber() {
		return studentRollNumber;
	}

	public void setStudentRollNumber(int studentRollNumber) {
		this.studentRollNumber = studentRollNumber;
	}
	
	public static void main(String args) {
		System.out.println();
	}

}
