package com.test.practice.Interface.myinterface;

public class ChromeDriverImplementation implements MyWebdriver {
	
	@Override
	public void get(String url) {
		System.out.println("Open Chrome Browser: " + url);
	}

	@Override
	public void click() {
		System.out.println("Click on Chrome Element");
	}
	
}
