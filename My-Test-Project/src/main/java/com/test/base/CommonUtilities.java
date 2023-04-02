package com.test.base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommonUtilities {

	DriverManager driverManager;

	private static Logger log = LoggerFactory.getLogger(CommonUtilities.class);

	public CommonUtilities(DriverManager drManager) {
		driverManager = drManager;
	}

	public void waitForTimeOutInSec(int waitTime) {
		int wait = waitTime * 1000;
		try {
			Thread.sleep(wait);
		} catch (InterruptedException e) {
			log.info(e.toString());
			Thread.currentThread().interrupt();
		}
	}

	public void scrollIntoCenterView(WebElement element) {
		Point p = element.getLocation();
		((JavascriptExecutor) DriverManager.getDriver()).executeScript(String
				.format("window.scroll(%s,%s - (window.innerHeight / 2));",
						p.getX(), p.getY()));
		log.info("----------Scrolled element into center view-----------");
	}

	public void scrollIntoCenterView(By element) {
		Point p = DriverManager.getDriver().findElement(element).getLocation();
		((JavascriptExecutor) DriverManager.getDriver()).executeScript(String
				.format("window.scroll(%s,%s - (window.innerHeight / 2));",
						p.getX(), p.getY()));
		log.info("----------Scrolled element into center view-----------");
	}

	public void scrollIntoCenterView(String element) {
		Point p = DriverManager.getDriver().findElement(By.xpath(element))
				.getLocation();
		((JavascriptExecutor) DriverManager.getDriver()).executeScript(String
				.format("window.scroll(%s,%s - (window.innerHeight / 2));",
						p.getX(), p.getY()));
		log.info("----------Scrolled element into center view-----------");
	}

}
