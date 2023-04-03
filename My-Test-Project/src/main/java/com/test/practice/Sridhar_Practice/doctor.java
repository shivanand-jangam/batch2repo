package com.demo;
class Doctor{
	float salary=50000;
}
class surgeon extends Doctor{
	float bonous =20000;
}

public class AJStudio{
	public static void main(String[] args) {
		Surgeon s=new Surgeon();
		System.out.println("salary of surgeon"+s.salary);
		System.out.println("bonous of surgeon"+s.bonous);
		
	}
}


