package com.test.practice.Interface.myinterface;

import cucumber.api.cli.Main;

public class ChromeDriverImplementation implements MyWebdriver {
	
	@Override
	public void get(String url) {
		System.out.println("Open Chrome Browser: " + url);
	}

	@Override
	public void click() {
		System.out.println("Click on Chrome Element");
		
	
	}
	
	
	
	public static void main(String [] args)
	{
		ChromeDriverImplementation ss=new ChromeDriverImplementation();
		ss.click();
		ss.get(w);
		
		
		System.out.println(w);
	}
	
}
