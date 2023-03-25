package com.test.practice;

public class Exceptions {

	public static void main1(String[] args) {
		try {
			System.out.println(1 / 0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("The number can not be devided by zero");
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("The number can not be devided by zero");
		} catch (Exception e1) {
			e1.printStackTrace();
			System.out.println("Exception");
		}
		finally {
			System.out.println("Finally block");
		}
	}
	
	 public static void main(String args[])
	    {
	    // First label
	    first:
	        for (int i = 0; i < 3; i++) {
	        // Second label
	        second:
	            for (int j = 0; j < 3; j++) {
	                if (i == 1 && j == 1) {
	                    // Using continue statement with label
	                    continue first;
	                }
	                System.out.println(i + " " + j);
	            }
	        }
	    }
}
