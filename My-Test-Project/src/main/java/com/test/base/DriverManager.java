package com.test.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

public class DriverManager {

	private static WebDriver driver;
	private static CommonUtilities commonUtilities;

	public static WebDriver getDriver() {
		WebDriver session = driver;
		if (session != null) {
			return session;
		}
		throw new WebDriverException("Webdriver Instance is not found");
	}

	public void setDriver(WebDriver dr) {
		driver = dr;
	}

	public static CommonUtilities getCommonUtilities() {
		return commonUtilities;
	}

	public static void setCommonUtilities(CommonUtilities objWrapperClass) {
		commonUtilities = objWrapperClass;
	}

}
