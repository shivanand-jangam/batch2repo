package com.test.page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.test.base.DriverManager;

public class CommonPage {

	public CommonPage() {
		PageFactory.initElements(DriverManager.getDriver(), this);
	}

	private static Logger log = LoggerFactory.getLogger(CommonPage.class);

	private static String TITLE_PLACEHOLDER = "//div[@class='main-header']";
	private static String SUBMENU_PLACEHOLDER = "//span[text()='%s']";

	public void shouldSeePageTitleAs(String pageTitle) {
		DriverManager.getCommonUtilities().waitForTimeOutInSec(2);
		Assert.assertEquals(
				DriverManager.getDriver()
						.findElement(By.xpath(TITLE_PLACEHOLDER)).getText(),
				pageTitle,
				" Current Page title is not as expected: " + pageTitle);
		DriverManager.getCommonUtilities().waitForTimeOutInSec(2);
		log.info("Verified that User is navigated to " + pageTitle + " Page");
	}

	public void clickOnSubMenuOption(String option) {
		DriverManager.getCommonUtilities().waitForTimeOutInSec(2);
		String locator = String.format(SUBMENU_PLACEHOLDER, option);
		DriverManager.getDriver().findElement(By.xpath(locator)).click();
		DriverManager.getCommonUtilities().waitForTimeOutInSec(2);
		log.info("User Clicks on " + option + " Sub Menu Option");
	}

}
