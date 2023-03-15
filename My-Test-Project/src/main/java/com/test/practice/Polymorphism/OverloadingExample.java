package com.test.practice.Polymorphism;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OverloadingExample {

	WebDriver driver;
	private static String locator1 = "//a[@title='New']";

	private static By locator2 = By.xpath("//a[@title='New']");

	@FindBy(xpath = "//a[@title='New']")
	private static WebElement locator3;

	public void clickMethod(String locator) {
		driver.findElement(By.xpath(locator)).click();
	}

	public void clickMethod(By locator) {
		driver.findElement(locator).click();
	}

	public void clickMethod() {
		locator3.click();
	}

	public static void main(String[] args) {

		
	}

}
