package com.test.practice.encapsulation;

import java.util.ArrayList;
import java.util.List;
import java.util.jar.Attributes.Name;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Pagination {

	WebDriver driver;
	@Test
	public void validatePage() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://datatables.net/examples/basic_init/alt_pagination.html");

		int pageSize = driver.findElements(By.xpath("//div[@id='example_paginate']//span//a")).size();
		System.out.println(pageSize);
		List<String> allPages = new ArrayList<String>();

		for(int i=1;i<=pageSize;i++) {
			String paginationClick = "//div[@id='example_paginate']//span//a[contains(text(),'"+i+"')]";
			driver.findElement(By.xpath(paginationClick)).click();
			Thread.sleep(5000);
			List<WebElement> allTableData = driver.findElements(By.xpath("//table[@id='example']//tbody//tr"));
			//boolean data = false;
			for (WebElement element : allTableData) {
	        	   allPages.add(element.getText());
	        	   if(allTableData.contains("Yuri Berry")) {
	                  break;
				    }
			}
			    
		}
		
		for (String name : allPages) {
			System.out.println(name);
		}
				
		driver.quit();

	}
}
