package com.test.practice.Polymorphism;

public class OverridingTestClass {

	static WebdriverOverrideImplementation chromeDriver = new ChromeDriverClass();
	static WebdriverOverrideImplementation FirefoxDriver = new FirefoxDriverClass();

	public static void main(String[] args) {
		chromeDriver.openBrowser();
		FirefoxDriver.openBrowser();
	}

}
