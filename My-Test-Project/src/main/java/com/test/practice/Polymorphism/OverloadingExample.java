package com.test.practice.Polymorphism;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OverloadingExample {

	WebDriver driver;

	private static String locator1 = "//a[@title='bhima']";

	private static By locator2 = By.xpath("//a[@title='shiva']");

	@FindBy(xpath = "//a[@title='Srikant']")
	private static WebElement locator3;

	// With Overloading concept
	public void clickMethod(String locator) {
		driver.findElement(By.xpath(locator)).click();
	}

	public void clickMethod(By locator) {
		driver.findElement(locator).click();
	}

	public void clickMethod(WebElement locator) {
		locator.click();
	}

	public static void main(String[] args) {
		OverloadingExample example = new OverloadingExample();
		example.clickMethod(locator3);
		example.clickMethod(locator1);
		example.clickMethod(locator2);
		
		example.clickUsingWebelemntMethod(locator3);
		example.clickUsingStringMethod(locator1);
		example.clickUsingByMethod(locator2);
		
	}
	
	// Without Overloading concept
	public void clickUsingStringMethod(String locator) {
		driver.findElement(By.xpath(locator)).click();
	}

	public void clickUsingByMethod(By locator) {
		driver.findElement(locator).click();
	}

	public void clickUsingWebelemntMethod(WebElement locator) {
		locator.click();
	}

}
