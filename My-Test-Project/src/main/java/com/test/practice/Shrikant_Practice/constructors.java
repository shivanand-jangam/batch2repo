package com.test.practice.Shrikant_Practice;

public class constructors {

	char s;
		String name;
		int number;
		int nnumber;
		
		constructors()
		{
			System.out.println("this is default cons");
		}
	constructors(String newname,int newnumber)
	{
		this.name=newname;
		this.number=newnumber;
	}
	constructors(int number)
	{
		this.nnumber=number;
	}
	
	constructors(char p)
	{
		this.s=p;
	}
	public static void main(String[] args) {
		constructors ff=new constructors();
		ff.name="Shrikanr";
		ff.number=10;
		ff.nnumber=20;
		
		ff.s='r';
		
		System.out.println(ff.name);
		System.out.println(ff.number);
		System.out.println(ff.nnumber);
		
		System.out.println(ff.s);
		
	}

}
