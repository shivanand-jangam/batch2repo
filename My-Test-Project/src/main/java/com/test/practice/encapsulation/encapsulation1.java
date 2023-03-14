package com.test.practice.encapsulation;

public class encapsulation1 {

private String name ;

private int roll_no;

private int fees;

public void  setstudentinformation ( String  sname, int rno, int number)
{
	name=sname;
	
	roll_no=rno;
	
	fees=number;
		
}

public void getstudentinformation () 
{
	
	System.out.println("student name: "+name );
	
	System.out.println("student roll no: "+roll_no);
	
	System.out.println("student fees:"+ fees);
	
}

}


