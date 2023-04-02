package com.test.page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.test.base.DriverManager;

public class HomePageMenu {

	public HomePageMenu() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}

	private static Logger log = LoggerFactory.getLogger(HomePageMenu.class);

	private static String MENU_PLACEHOLDER = "//div[@class='card-body']/h5[contains(text(),'%s')]";

	public void clickOnMenuOption(String option) {
		DriverManager.getCommonUtilities().waitForTimeOutInSec(2);
		String locator = String.format(MENU_PLACEHOLDER, option);
		DriverManager.getCommonUtilities().scrollIntoCenterView(locator);
		DriverManager.getCommonUtilities().waitForTimeOutInSec(1);
		DriverManager.getDriver().findElement(By.xpath(locator)).click();
		DriverManager.getCommonUtilities().waitForTimeOutInSec(3);
		log.info("User Clicks on " + option + " Menu Option");
	}

}
