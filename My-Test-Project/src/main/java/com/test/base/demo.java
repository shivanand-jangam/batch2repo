package com.test.base;

public class demo {
	public static void main(String[] args) {



		String str= "AshwiniiwaA";
		char[] array =  str.toCharArray();

        System.out.println(str);

        for(int i =0;i<str.length();i++) {
        	for(int j =i+1;j<str.length();j++) {
        		if(array[i]==array[j]) {
        			System.out.println(array[j]);
        		}
        	}
        }
	}
}
