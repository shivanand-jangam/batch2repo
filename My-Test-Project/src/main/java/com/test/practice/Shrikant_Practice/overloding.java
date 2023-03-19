package com.test.practice.Shrikant_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class overloding {

	WebDriver driver;
	  private static String locator1="//li[@id='menu-item-6898']/a";
	  private static By locator2=By.xpath("(//li[@id='menu-item-6898']/following-sibling::li/a)[1]");
	
	public static void main(String[] args) {

		System.setProperty(null, null);
		
	}

}
