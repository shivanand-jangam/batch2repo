package com.test.practice.Shrikant_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Test1 {
	WebDriver driver;
	private static String locator1="//tag[@class='shhd']";
	private static By locator2=By.xpath("//tag[@class='shiri']");
	@FindBy(xpath="//tag[@class='lll']")
	private static WebElement locator3;
	
	public void clickAction(String locator)
	{
		driver.findElement(By.xpath(locator)).click();
	}
	
	public void clickAction(By locator)
	{
		driver.findElement(locator).click();
	}
	
	public void clickAction(WebElement locator)
	{
		locator.click();
	}
	
	
	public static void main(String[] args) {
		
		Test1 t=new Test1 ();
		t.clickAction(locator1);
		t.clickAction(locator2);
		t.clickAction(locator3);
		
		
		t.clickUsingWebelemntMethod(locator3);
		t.clickUsingStringMethod(locator1);
		t.clickUsingByMethod(locator2);
		
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
