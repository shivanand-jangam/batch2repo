package com.test.practice.Interface.myinterface;

public class FirefoxDriverImplementation implements MyWebdriver {

	@Override
	public void get(String url) {
		System.out.println("Open Firefox Browser: " + url);
	}

	@Override
	public void click() {
		System.out.println("Click on Firefox Element");
	}

	public void test() {
		System.out.println("My Test");
	}

	
	public static void main(String[] args) {
		
	
	FirefoxDriverImplementation ff=new FirefoxDriverImplementation();
	
	ff.click();
	ff.test();
	ff.get(w);
	
	}
}
