package com.test.practice.AbstractClass;

public class JavaPractise {
	 public static void main(String[] args) {
		
//        String number = "121";
//        String num = "";
//        for(int i=number.length()-1;i>=0;i--) {
//        	num= num+number.charAt(i);
//        }
//        System.out.println(num);
//        
//        if(number.contains(num)) {
//        	System.out.println("yes");
//        }else {
//			System.out.println("no");
//		}
		 
		 int[] num = {1,2,3,4,5,6,8,9}; 
		 int  max = num[0];
		 
		 for(int i=0;i<num.length;i++) {
			 if(num[i]<max) {
				 max=num[i];
			 }
			 System.out.println(max);
		 }
		 
	}
}
