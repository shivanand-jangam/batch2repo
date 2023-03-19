package com.test.practice.Interface.myinterface;

public class InterfaceCallingClass {

	MyWebdriver webdriver;

	public static void main(String[] args) {
		
		InterfaceCallingClass callingClass = new InterfaceCallingClass();
		
		callingClass.webdriver = new ChromeDriverImplementation();
		
		callingClass.webdriver.get("https://web.whatsapp.com/");
		
		callingClass.webdriver = new FirefoxDriverImplementation();
		
		callingClass.webdriver.get("https://web.whatsapp.com/");

	}

}
