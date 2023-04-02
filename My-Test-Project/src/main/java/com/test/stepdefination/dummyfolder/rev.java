package com.test.stepdefination.dummyfolder;

import java.util.Scanner;

public class rev {

public static void main(String[] args) {
	
	int name = 121;
	String name2 =Integer.toString(name);
	String rev="";
	
	for(int i=name2.length()-1;i>=0;i--) {
		rev= rev+name2.charAt(i);
	}
	
	System.out.println(rev);
	
	if(rev.equalsIgnoreCase(name2)) {
		System.out.println("This is a palindrome number");
	}else {
		System.out.println("Not an palindrome number");
	}
}	
}
