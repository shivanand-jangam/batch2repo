package com.test.base;

public class BaseTest extends BrowserFactory {
	public CommonUtilities commonUtilities;

	public BaseTest() {
		commonUtilities = new CommonUtilities(driverManager);
		DriverManager.setCommonUtilities(commonUtilities);
	}

}
