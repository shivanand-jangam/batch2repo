package com.test.practice.encapsulation;

public class Encapusulation_test {

	private int id;
	private int salary;
	private String name;
	
	public void setinformation(String ename,int cid,int esalary)
	{
		name=ename;
		salary=esalary;
		id=cid;
	}
	
	
	public void getinformation()
	{
		System.out.println("employee name : " +name);
		System.out.println("employee id : " +id);
		System.out.println("employee salary : " +salary);
	}
	
}
